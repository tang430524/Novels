package com.ty.util;


import java.util.Map;

/**
 * 
 * @author ty
 *�������
 */
public class Rule {
	 /** 
     * ���� 
     */  
    private String url;  
  
    /** 
     * �������� 
     */  
    private String[] params;  
    /** 
     * ������Ӧ��ֵ 
     */  
    private String[] values;  
  
    /** 
     * �Է��ص�HTML���������õı�ǩ����������type 
     */  
    private String[] resultTagName;  

    /** 
     * CLASS / ID / SELECTION 
     * ����resultTagName�����ͣ�Ĭ��ΪID  
     */  
    private int[] type ;  
    private Map<String, String> head;


	/** 
     *GET / POST 
     * ��������ͣ�Ĭ��GET 
     */  
    private int requestMoethod = GET ;   
      
    public final static int GET = 0 ;  
    public final static int POST = 1 ;  
      
  
    public final static int CLASS = 0;  
    public final static int ID = 1;  
    public final static int SELECTION = 2;  
  
    public Rule()  
    {  
    }  
  
      /**
       * 
       * @param url ���� 
       * @param params �������� 
       * @param values ������Ӧ��ֵ 
       * @param resultTagName �Է��ص�HTML����һ�ι������õı�ǩ����������type 
       * @param type CLASS / ID / SELECTION  ����resultTagName�����ͣ�Ĭ��ΪID  
       * @param requestMoethod ��������ͣ�Ĭ��GET 
       */
    public Rule(String url, String[] params, String[] values,  
            String[] resultTagName, int[] type ,int requestMoethod,Map<String,String> head)  
    {  
        super();  
        this.url = url;  
        this.params = params;  
        this.values = values;  
        this.resultTagName = resultTagName;  
        this.type = type;  
        this.requestMoethod = requestMoethod;  
        this.head = head;  
    }  
  
    public String getUrl()  
    {  
        return url;  
    }  
  
    public void setUrl(String url)  
    {  
        this.url = url;  
    }  
  
    public String[] getParams()  
    {  
        return params;  
    }  
  
    public void setParams(String[] params)  
    {  
        this.params = params;  
    }  
  
    public String[] getValues()  
    {  
        return values;  
    }  
  
    public void setValues(String[] values)  
    {  
        this.values = values;  
    }  
  
    public String[] getResultTagName()  
    {  
        return resultTagName;  
    }  
  
    public void setResultTagName(String[] resultTagName)  
    {  
        this.resultTagName = resultTagName;  
    }  
  
    public int[] getType()  
    {  
        return type;  
    }  
  
    public void setType(int[] type)  
    {  
        this.type = type;  
    }  
  
    public int getRequestMoethod()  
    {  
        return requestMoethod;  
    }  
  
    public void setRequestMoethod(int requestMoethod)  
    {  
        this.requestMoethod = requestMoethod;  
    }


    public Map<String, String> getHead() {
		return head;
	}

	public void setHead(Map<String, String> head) {
		this.head = head;
	}
}  

