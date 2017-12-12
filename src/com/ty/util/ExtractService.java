package com.ty.util;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExtractService {
	public   List<LinkTypeData> iterdatas=new ArrayList<LinkTypeData>();
	
	public List<LinkTypeData> getIterdatas() {
		return iterdatas;
	}

	public void setIterdatas(List<LinkTypeData> iterdatas) {
		this.iterdatas = iterdatas;
	}

	public static List<LinkTypeData> extract(Rule rule) throws IOException{ 
		ExtractService es=new ExtractService();
		//对URL 进行必要的检验
		validateRule(rule);
		
		LinkTypeData data=null;
		/**\
		 *解析rule
		 */
		try {
			String url=rule.getUrl();
			System.out.println("url"+url);
			String[] params=rule.getParams();String[] values = rule.getValues();  
			String[] resultTagName=rule.getResultTagName();
			int[] type=rule.getType();
			int requestType =rule.getRequestMoethod();
			Map<String, String> head=rule.getHead();
			Connection conn=Jsoup.connect(url);
			//设置参数
			conn.referrer("http://book.km.com/chapter/1344251_1.html");
			if(params!=null){
				for(int i=0;i<params.length;i++){
					conn.data(params[i], values[i]);
				}
			}
		

			if(head!=null)conn.headers(head);
			
			//设置请求类型
			Document doc =null;
			switch (requestType){
			case Rule.GET:
					doc =conn.timeout(10000).get();
					break;
			case Rule.POST:
					doc=conn.timeout(10000).post();
					break;
			}
//处理返回数据
//			System.out.println(doc);
			if(type.length!=resultTagName.length){data = new LinkTypeData();data.setLinkText(doc.html());es.getIterdatas().add(data); return es.getIterdatas();}
			Elements results =new Elements();
				switch(type[0]){
				case Rule.CLASS:
					results = doc.getElementsByClass(resultTagName[0]);
					break;
				case Rule.ID:
					Element result=doc.getElementById(resultTagName[0]);
					results.add(result);
					break;
				case Rule.SELECTION:
					results=doc.select(resultTagName[0]);
					break;
				default:
					//当resultTagName 为空时默认取body标签
					System.out.println("body。。。。");
					results=doc.getElementsByTag("body");
				}
			
				es.setIterdatas(es.IterFilter(results, type, resultTagName, 1));
//					for(Element link : results){
//						//必要的筛选
//	//				System.out.println(link.html());
//						String linkHref=link.attr("href");
//						String linkText=link.html();
//						data = new LinkTypeData();
//						data.setLinkHref(linkHref);
//						data.setLinkText(linkText);
//						iterdatas.add(data);
//						
//					}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return es.getIterdatas();
	}

	/**
	 * 迭代过滤
	 * @param results
	 * @param type
	 * @param resultTagName
	 * @param i 计数并判断终止迭代
	 * @return
	 */
	public List<LinkTypeData> IterFilter(Elements results,int[] type,String[] resultTagName,int i){
		if(i>=type.length){
			return iterdatas;
		}else{
			for(Element result:results){
//				System.out.println(i+resultTagName[i]);
				switch(type[i]){
				case Rule.CLASS:
					results = result.getElementsByClass(resultTagName[i]);
					break;
				case Rule.ID:
					Element result1=result.getElementById(resultTagName[i]);
					results.add(result1);
					break;
				case Rule.SELECTION:
					results=result.select(resultTagName[i]);
					break;
				default:
					//当resultTagName 为空时默认取body标签
					results=result.getElementsByTag("body");
				}
			
				int x=i+1;
				if(x>=type.length){
					LinkTypeData data=null;
					for(Element link : results){
						//必要的筛选
					
						String linkHref=link.attr("href");
						String linkText=link.html();
						data = new LinkTypeData();
						data.setLinkHref(linkHref);
						data.setLinkText(linkText);
						iterdatas.add(data);
					}
					
				} else{
					 IterFilter(results, type, resultTagName,x);
				}
				
				
			}
		}

		
		return iterdatas;
	}
	
	
	/**
	 * 对于传入的参数进行必要的校验
	 * @param rule
	 */
	private static void validateRule(Rule rule) {
		String url= rule.getUrl();
		if(url.equals("")||url==null){
			throw new RuleException("url不能为空！");  
		}
		if (!url.startsWith("http://"))  
        {  if(!url.startsWith("https://")){ throw new RuleException("url的格式不正确！");  }
        }  
  
        if (rule.getParams() != null && rule.getValues() != null)  
        {  
            if (rule.getParams().length != rule.getValues().length)  
            {  
                throw new RuleException("参数的键值对个数不匹配！");  
            }  
        }  
	}
}
