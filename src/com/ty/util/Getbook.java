package com.ty.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





public class Getbook {
public static String BOOKROOTPATH="http://book.km.com";//重要地址 页面内切换需要
public static void main(String[] args) throws IOException {
	String href="http://book.km.com/chapterlist/1343939.html";
	String path="E:\\test_fb2.txt";
	Getbook getbook=new Getbook();
//	getbook.Download(path, href);
	 List<LinkTypeData> list=	getbook.searchBook("好");
	 for (LinkTypeData data : list)  
     {  
		 System.out.println(data.getLinkText());
     }
	
}

public boolean Download(String path,String href) throws IOException{
	File f=new File(path);
	 FileWriter fw=null;
   BufferedWriter bw=null;
	Getbook getbook=new Getbook();
//	String content=getbook.bookDetail(href);
	  for (LinkTypeData data : getbook.getSection(href))
     {  
		  String title=data.getLinkText();
		  System.out.println(title);
   	  String content=getbook.bookDetail(BOOKROOTPATH+data.getLinkHref());
   	  try{
	            if(!f.exists()){
	                f.createNewFile();
	            }
	             fw=new FileWriter(f.getAbsoluteFile(),true);  //true表示可以追加新内容  
	                         //fw=new FileWriter(f.getAbsoluteFile()); //表示不追加
	             bw=new BufferedWriter(fw);
	             bw.write(title.toString()+"\r\n");
	             bw.write(content.toString());
	             bw.close();
	        }catch(Exception e){
	           e.printStackTrace();
	           return false;
	        }
     }
	return true;
}
public List<LinkTypeData> getSection(String href) throws IOException{
	List<LinkTypeData> extracts = null;
	Rule rule = new Rule(href,  
			null,null,  
			new String[] {"catalog_list clearfix","a"}, new int[] {0,Rule.SELECTION},Rule.GET,null);  
   extracts = ExtractService.extract(rule);  
	
	return extracts ;
}

public String bookDetail(String href) throws IOException{
	Getbook getbook=new Getbook();
	String[] str=href.split("/");
	String endstr=str[str.length-1];//1344251_2.html
	String[] end=endstr.split("_");
	String book_id = end[0];
	String chapter_id=end[1].split(".h")[0];
	
	Rule rule = new Rule(href,  
			null,null, new String[] {"top-menu","script"}, new int[] {-1,Rule.SELECTION},
Rule.GET,null);  
    List<LinkTypeData> extracts = ExtractService.extract(rule);  
	String sign=getbook.resolve(extracts);
	String content=getbook.getdetailSection(book_id, chapter_id, sign);
//	System.out.println(content);
	return content;
}
	
	public String getdetailSection(String book_id,String chapter_id,String sign) throws IOException{
		String referer=" http://book.km.com/chapter/"+book_id+"_"+chapter_id+".html";
		
		Map<String,String> map=new HashMap<String, String>();
		map.put("Host", " book.km.com");
		map.put("User-Agent", " Mozilla/5.0 (Windows NT 6.1; WOW64; rv:55.0) Gecko/20100101 Firefox/55.0");
		map.put("Accept", " */*");
		map.put("Accept-Language", " zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
		map.put("Accept-Encoding", " gzip, deflate");
		map.put("X-Requested-With", " XMLHttpRequest");
		map.put("Referer", referer);
		map.put("Cookie", "");
		map.put("Connection", " keep-alive");
		map.put("Pragma", " no-cache");
		map.put("Cache-Control", " no-cache");
		 Rule rule = new Rule("http://book.km.com/index.php",  
					new String[] {"a","book_id","c","chapter_id","sign"},new String[] {"getContent",book_id,"catch",chapter_id,sign},  
					new String[] {" ","p"}, new int[] {-1,Rule.SELECTION},Rule.GET,map);  
		    List<LinkTypeData> extracts = ExtractService.extract(rule);  
		   // System.out.println(printf(extracts));
		
		
		return printf(extracts);
	}
	
	public String  resolve(List<LinkTypeData> datas)  
    {  
		String sign=null;
        for (LinkTypeData data : datas)  
        {  
        	 String str = data.getLinkText();
        	// System.out.println("+++"+str);
        	 Pattern pattern =Pattern.compile("RP.sign = \"([a-zA-Z0-9]*)\";");
        	 Matcher m = pattern.matcher(str);
        	 while( m.find() ){
//        		 System.out.println( m.group());
//        		 System.out.println( m.group(1));
        		 sign=m.group(1);
        		}
        }
		return  sign;  
    }
        public String  printf(List<LinkTypeData> datas)  
        {  
        	StringBuffer stb = new StringBuffer();
        	for (LinkTypeData data : datas)  
        	{  
        		stb.append(data.getLinkText());
        	}
			return stb.toString();  
        }
        
        public List<LinkTypeData> searchBook(String bname) throws IOException{
        	Map<String,String> map=new HashMap<String, String>();
        	
    		map.put("Host", " book.km.com");
    		map.put("User-Agent", " Mozilla/5.0 (Windows NT 6.1; WOW64; rv:55.0) Gecko/20100101 Firefox/55.0");
    		map.put("Accept", " text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
    		map.put("Accept-Language", " zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
    		map.put("Accept-Encoding", " gzip, deflate");
    		map.put("Referer", " http://book.km.com/");
    		map.put("Cookie", "");
    		map.put("Connection", " keep-alive");
    		map.put("Pragma", " no-cache");
    		map.put("Upgrade-Insecure-Requests", " 1");
        	 Rule rule = new Rule("http://book.km.com/search.html",  
 					new String[] {"search_type","keyword"},new String[] {"index",bname}, 
 					new String[] {"lazyload_box","li","info","dt","a"}, new int[] {0,Rule.SELECTION,0,Rule.SELECTION,Rule.SELECTION} ,Rule.GET,map);  
         	  List<LinkTypeData> extracts = ExtractService.extract(rule);  
         	   for (LinkTypeData data : extracts)  
               {  
               	 String name = data.getLinkText();
               	name=name.replaceAll("<em class=\"red\">", "");
               	name=name.replaceAll("</em>", "");
               	data.setLinkText(name);
               	 String href=data.getLinkHref();
               	 href=href.replaceAll("/shuku/", "");
               	 href=href.replaceAll(".html", "");
               	 data.setLinkHref(href);
//               	System.out.println("+++"+name);
//               	System.out.println("==="+data.getLinkHref());
               	
               }
     
         	   return extracts;
        }
}
