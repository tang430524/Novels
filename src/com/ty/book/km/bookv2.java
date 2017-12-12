package com.ty.book.km;

import java.io.IOException;
import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import com.ty.util.Getbook;
import com.ty.util.LinkTypeData;

import org.eclipse.swt.custom.ViewForm;

public class bookv2 {

	protected Shell shell;
	private Text bname;
	private Text path;
	private Text name;
	String href1="";
	String href2="";
	String href3="";
	String href4="";
	String href5="";
	String href6="";
	String href7="";
	String href8="";
	String href9="";
	String href10="";
	String href11="";
	String href12="";
	String href13="";
	String href14="";
	String href15="";
	String href16="";
	String href17="";
	String href18="";
	String href19="";
	String href20="";
	String href21="";
	String href22="";
	String href23="";
	String href24="";
	String href25="";
	String href26="";
	String href27="";
	String href28="";
	String href29="";
	String href30="";
	String downloadhref="";
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			bookv2 window = new bookv2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setModified(true);
		shell.setSize(488, 468);
		shell.setText("\u4E0B\u8F7D\u795E\u5668");
		shell.setLayout(null);
		
		Label tips = new Label(shell, SWT.NONE);
		tips.setLocation(56, 10);
		tips.setSize(377, 17);
		tips.setText("\u6E29\u99A8\u63D0\u793A\uFF1A\u8BF7\u8F93\u5165\u5728\u8981\u4E0B\u8F7D\u5185\u5BB9\u94FE\u63A5\uFF0C\u67E5\u770B\u5168\u90E8\u7AE0\u8282\u7684\u9875\u9762\uFF01\uFF01\uFF01");
		
		Label label = new Label(shell, SWT.NONE);
		label.setText("\u4E66\u540D\uFF1A");
		label.setBounds(10, 49, 36, 26);
		
		bname = new Text(shell, SWT.BORDER);
		bname.setText("\u5475\u5475");
		bname.setBounds(66, 49, 279, 23);
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(10, 78, 452, 178);
		composite.setVisible(false);
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setBounds(10, 10, 61, 17);
		label_1.setText("\u4FDD\u5B58\u8DEF\u5F84\uFF1A");
		
		path = new Text(composite, SWT.BORDER);
		path.setBounds(91, 7, 216, 23);
		path.setText("C:\\Users\\Administrator\\Desktop\\");
		
		
		
		Button pathchoose = new Button(composite, SWT.NONE);
		pathchoose.setBounds(329, 5, 80, 27);
		pathchoose.setText("\u9009\u62E9\u8DEF\u5F84");
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setBounds(10, 63, 61, 17);
		label_3.setText("\u6587\u4EF6\u540D\uFF1A");
		
		name = new Text(composite, SWT.BORDER);
		name.setBounds(91, 60, 120, 23);
		name.setText("\u65B0\u5EFA\u6587\u672C\u6587\u6863");
		
		Button download = new Button(composite, SWT.NONE);
		download.setBounds(166, 105, 101, 23);
		download.setText("\u4E0B\u8F7D");
		
		ProgressBar progressBar = new ProgressBar(composite, SWT.NONE);
		progressBar.setBounds(10, 150, 383, 17);
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setBounds(415, 150, 37, 17);
		label_2.setText("0%");
		
		final Composite search = new Composite(shell, SWT.NONE);
		search.setLocation(0, 80);
		search.setSize(460, 326);
		
		final Button btnNewButton_1 = new Button(search, SWT.NONE);
		btnNewButton_1.setLocation(20, 5);
		btnNewButton_1.setSize(80, 27);
		btnNewButton_1.setText("New Button");
		
		final Button btnNewButton_2 = new Button(search, SWT.NONE);
		btnNewButton_2.setBounds(130, 5, 80, 27);
		btnNewButton_2.setText("New Button");
		
		final Button btnNewButton_3 = new Button(search, SWT.NONE);
		btnNewButton_3.setBounds(240, 5, 80, 27);
		btnNewButton_3.setText("New Button");
		
		final Button btnNewButton_4 = new Button(search, SWT.NONE);
		btnNewButton_4.setBounds(350, 5, 80, 27);
		btnNewButton_4.setText("New Button");
		
		final Button btnNewButton_5 = new Button(search, SWT.NONE);
		btnNewButton_5.setBounds(20, 45, 80, 27);
		btnNewButton_5.setText("New Button");
		
		final Button btnNewButton_6 = new Button(search, SWT.NONE);
		btnNewButton_6.setBounds(130, 45, 80, 27);
		btnNewButton_6.setText("New Button");
		
		final Button btnNewButton_7 = new Button(search, SWT.NONE);
		btnNewButton_7.setBounds(240, 45, 80, 27);
		btnNewButton_7.setText("New Button");
		
		final Button btnNewButton_8 = new Button(search, SWT.NONE);
		btnNewButton_8.setBounds(350, 45, 80, 27);
		btnNewButton_8.setText("New Button");
		
		final Button btnNewButton_9 = new Button(search, SWT.NONE);
		btnNewButton_9.setBounds(20, 85, 80, 27);
		btnNewButton_9.setText("New Button");
		
		final Button btnNewButton_10 = new Button(search, SWT.NONE);
		btnNewButton_10.setBounds(130, 85, 80, 27);
		btnNewButton_10.setText("New Button");
		
		final Button btnNewButton_11 = new Button(search, SWT.NONE);
		btnNewButton_11.setBounds(240, 85, 80, 27);
		btnNewButton_11.setText("New Button");
		
		final Button btnNewButton_12 = new Button(search, SWT.NONE);
		btnNewButton_12.setBounds(350, 85, 80, 27);
		btnNewButton_12.setText("New Button");
		
		final Button btnNewButton_13 = new Button(search, SWT.NONE);
		btnNewButton_13.setBounds(20, 125, 80, 27);
		btnNewButton_13.setText("New Button");
		
		final Button btnNewButton_14 = new Button(search, SWT.NONE);
		btnNewButton_14.setLocation(130, 125);
		btnNewButton_14.setSize(80, 27);
		btnNewButton_14.setText("New Button");
		
		final Button btnNewButton_15 = new Button(search, SWT.NONE);
		btnNewButton_15.setBounds(240, 125, 80, 27);
		btnNewButton_15.setText("New Button");
		
		final Button btnNewButton_16 = new Button(search, SWT.NONE);
		btnNewButton_16.setBounds(350, 125, 80, 27);
		btnNewButton_16.setText("New Button");
		
		final Button btnNewButton_17 = new Button(search, SWT.NONE);
		btnNewButton_17.setBounds(20, 165, 80, 27);
		btnNewButton_17.setText("New Button");
		
		final Button btnNewButton_18 = new Button(search, SWT.NONE);
		btnNewButton_18.setBounds(130, 165, 80, 27);
		btnNewButton_18.setText("New Button");
		
		final Button btnNewButton_19 = new Button(search, SWT.NONE);
		btnNewButton_19.setBounds(240, 165, 80, 27);
		btnNewButton_19.setText("New Button");
		
		final Button btnNewButton_20 = new Button(search, SWT.NONE);
		btnNewButton_20.setBounds(350, 165, 80, 27);
		btnNewButton_20.setText("New Button");
		
		final Button btnNewButton_21 = new Button(search, SWT.NONE);
		btnNewButton_21.setText("New Button");
		btnNewButton_21.setBounds(20, 205, 80, 27);
		
		final Button btnNewButton_22 = new Button(search, SWT.NONE);
		btnNewButton_22.setText("New Button");
		btnNewButton_22.setBounds(130, 205, 80, 27);
		
		final Button btnNewButton_23 = new Button(search, SWT.NONE);
		btnNewButton_23.setText("New Button");
		btnNewButton_23.setBounds(240, 205, 80, 27);
		
		final Button btnNewButton_24 = new Button(search, SWT.NONE);
		btnNewButton_24.setText("New Button");
		btnNewButton_24.setBounds(350, 205, 80, 27);
		
		final Button btnNewButton_25 = new Button(search, SWT.NONE);
		btnNewButton_25.setText("New Button");
		btnNewButton_25.setBounds(20, 245, 80, 27);
		
		final Button btnNewButton_26 = new Button(search, SWT.NONE);
		btnNewButton_26.setText("New Button");
		btnNewButton_26.setBounds(130, 245, 80, 27);
		
		final Button btnNewButton_27 = new Button(search, SWT.NONE);
		btnNewButton_27.setText("New Button");
		btnNewButton_27.setBounds(240, 245, 80, 27);
		
		final Button btnNewButton_28 = new Button(search, SWT.NONE);
		btnNewButton_28.setText("New Button");
		btnNewButton_28.setBounds(350, 245, 80, 27);
		
		final Button btnNewButton_29 = new Button(search, SWT.NONE);
		btnNewButton_29.setText("New Button");
		btnNewButton_29.setBounds(20, 288, 80, 27);
		
		final Button btnNewButton_30 = new Button(search, SWT.NONE);
		btnNewButton_30.setText("New Button");
		btnNewButton_30.setBounds(130, 288, 80, 27);
		
	
		setVisible(false,composite, search, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_30, btnNewButton_29, btnNewButton_28, btnNewButton_27, btnNewButton_26, btnNewButton_25, btnNewButton_24, btnNewButton_23, btnNewButton_22, btnNewButton_21, btnNewButton_20, btnNewButton_19, btnNewButton_18, btnNewButton_17, btnNewButton_16, btnNewButton_15, btnNewButton_14, btnNewButton_13, btnNewButton_12, btnNewButton_11, btnNewButton_10, btnNewButton_9, btnNewButton_8, btnNewButton_7, btnNewButton_6, btnNewButton_5, btnNewButton_4);
		
		
		
		Button tosearch = new Button(shell, SWT.NONE);
		tosearch.setLocation(382, 44);
		tosearch.setSize(80, 27);
		tosearch.setText("\u641C\u7D22");
		/**
		 * 点击搜索
		 */
		tosearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setVisible(false, composite, search, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_30, btnNewButton_29, btnNewButton_28, btnNewButton_27, btnNewButton_26, btnNewButton_25, btnNewButton_24, btnNewButton_23, btnNewButton_22, btnNewButton_21, btnNewButton_20, btnNewButton_19, btnNewButton_18, btnNewButton_17, btnNewButton_16, btnNewButton_15, btnNewButton_14, btnNewButton_13, btnNewButton_12, btnNewButton_11, btnNewButton_10, btnNewButton_9, btnNewButton_8, btnNewButton_7, btnNewButton_6, btnNewButton_5, btnNewButton_4);
				final Getbook getbook=new Getbook();
				System.out.println(bname.getText().trim());
		
							try {
								 List<LinkTypeData> list=	getbook.searchBook(bname.getText());
								 int i=1;
								  for (LinkTypeData data : list)  
					               {  
									  if(i==1){btnNewButton_1.setVisible(true);btnNewButton_1.setText(data.getLinkText());href1=data.getLinkHref(); }
									  if(i==2){btnNewButton_2.setVisible(true);btnNewButton_2.setText(data.getLinkText());href2=data.getLinkHref(); }
									  if(i==3){btnNewButton_3.setVisible(true);btnNewButton_3.setText(data.getLinkText());href3=data.getLinkHref(); }
									  if(i==4){ btnNewButton_4.setVisible(true);btnNewButton_4.setText(data.getLinkText());href4=data.getLinkHref(); }
									  if(i==5){btnNewButton_5.setVisible(true);btnNewButton_5.setText(data.getLinkText());href5=data.getLinkHref(); }
									  if(i==6){btnNewButton_6.setVisible(true);btnNewButton_6.setText(data.getLinkText());href6=data.getLinkHref(); }
									  if(i==7){btnNewButton_7.setVisible(true);btnNewButton_7.setText(data.getLinkText());href7=data.getLinkHref(); }
									  if(i==8){btnNewButton_8.setVisible(true);btnNewButton_8.setText(data.getLinkText());href8=data.getLinkHref(); }
									  if(i==9){btnNewButton_9.setVisible(true);btnNewButton_9.setText(data.getLinkText());href9=data.getLinkHref(); }
									  if(i==10){ btnNewButton_10.setVisible(true);btnNewButton_10.setText(data.getLinkText());href10=data.getLinkHref(); }
									  if(i==11){btnNewButton_11.setVisible(true);btnNewButton_11.setText(data.getLinkText());href11=data.getLinkHref(); }
									  if(i==12){ btnNewButton_12.setVisible(true);btnNewButton_12.setText(data.getLinkText());href12=data.getLinkHref(); }
									  if(i==13){btnNewButton_13.setVisible(true);btnNewButton_13.setText(data.getLinkText());href13=data.getLinkHref(); }
									  if(i==14){btnNewButton_14.setVisible(true);btnNewButton_14.setText(data.getLinkText());href14=data.getLinkHref(); }
									  if(i==15){btnNewButton_15.setVisible(true);btnNewButton_15.setText(data.getLinkText());href15=data.getLinkHref(); }
									  if(i==16){btnNewButton_16.setVisible(true);btnNewButton_16.setText(data.getLinkText());href16=data.getLinkHref(); }
									  if(i==17){btnNewButton_17.setVisible(true);btnNewButton_17.setText(data.getLinkText());href17=data.getLinkHref(); }
									  if(i==18){btnNewButton_18.setVisible(true);btnNewButton_18.setText(data.getLinkText());href18=data.getLinkHref(); }
									  if(i==19){btnNewButton_19.setVisible(true);btnNewButton_19.setText(data.getLinkText());href19=data.getLinkHref(); }
									  if(i==20){btnNewButton_20.setVisible(true);btnNewButton_20.setText(data.getLinkText());href20=data.getLinkHref(); }
									  if(i==21){btnNewButton_21.setVisible(true);btnNewButton_21.setText(data.getLinkText());href21=data.getLinkHref(); }
									  if(i==22){btnNewButton_22.setVisible(true);btnNewButton_22.setText(data.getLinkText());href22=data.getLinkHref(); }
									  if(i==23){btnNewButton_23.setVisible(true);btnNewButton_23.setText(data.getLinkText());href23=data.getLinkHref(); }
									  if(i==24){btnNewButton_24.setVisible(true);btnNewButton_24.setText(data.getLinkText());href24=data.getLinkHref(); }
									  if(i==25){btnNewButton_25.setVisible(true);btnNewButton_25.setText(data.getLinkText());href25=data.getLinkHref(); }
									  if(i==26){btnNewButton_26.setVisible(true);btnNewButton_26.setText(data.getLinkText());href26=data.getLinkHref(); }
									  if(i==27){ btnNewButton_27.setVisible(true);btnNewButton_27.setText(data.getLinkText());href27=data.getLinkHref(); }
									  if(i==28){btnNewButton_28.setVisible(true);btnNewButton_28.setText(data.getLinkText());href28=data.getLinkHref(); }
									  if(i==29){btnNewButton_29.setVisible(true);btnNewButton_29.setText(data.getLinkText());href29=data.getLinkHref(); }
									  if(i==30){ btnNewButton_30.setVisible(true);btnNewButton_30.setText(data.getLinkText());href30=data.getLinkHref(); }
									  i++;if(i>list.size())break;
					               }
							} catch (Exception e1) {
								
								e1.printStackTrace();
							}
					
					
			
			}
		});
		
		
		
		/**
		 * 点击下载的时候
		 */
		download.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				   String tpath0=path.getText().trim();//路径
					String tname=name.getText().trim();
					final String tpath=tpath0+tname+".txt";
					final String thref="http://book.km.com/chapterlist/"+downloadhref+".html";//下载地址
					final Getbook getbook=new Getbook();
				Runnable myRunnable = new Runnable(){
					   public void run(){
							try {
								getbook.Download(tpath, thref);
							} catch (IOException e1) {
								
								e1.printStackTrace();
							}
					   }
					};
					Thread thread = new Thread(myRunnable);
					thread.start();
				
			}
		});
		
		
		pathchoose.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//新建文件夹（目录）对话框
				DirectoryDialog folderdlg=new DirectoryDialog(shell);
				//设置文件对话框的标题
				folderdlg.setText("文件选择");
				//设置初始路径
				folderdlg.setFilterPath("SystemDrive");
				//设置对话框提示文本信息
				folderdlg.setMessage("请选择相应的文件夹");
				//打开文件对话框，返回选中文件夹目录
				String selecteddir=folderdlg.open();
				if(selecteddir==null){
				return ;
				}
				else{
				System.out.println("您选中的文件夹目录为："+selecteddir);
				path.setText(selecteddir);
				}
			}
		});
	
		
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href1;
			}
		});
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href2;
			}
		});
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href3;
			}
		});
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href4;
			}
		});
		btnNewButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href5;
			}
		});
		btnNewButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href6;
			}
		});
		btnNewButton_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href7;
			}
		});
		btnNewButton_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href8;
			}
		});
		btnNewButton_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href9;
			}
		});
		btnNewButton_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href10;
			}
		});
		btnNewButton_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href11;
			}
		});
		btnNewButton_20.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href20;
			}
		});
		btnNewButton_21.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href21;
			}
		});
		btnNewButton_22.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href22;
			}
		});
		btnNewButton_23.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href23;
			}
		});
		btnNewButton_24.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href24;
			}
		});
		btnNewButton_25.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href25;
			}
		});
		btnNewButton_26.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href26;
			}
		});
		btnNewButton_27.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href27;
			}
		});
		btnNewButton_28.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href28;
			}
		});
		btnNewButton_29.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href29;
			}
		});
		btnNewButton_30.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href30;
			}
		});
		btnNewButton_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href12;
			}
		});
		btnNewButton_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href13;
			}
		});
		btnNewButton_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href14;
			}
		});
		btnNewButton_15.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href15;
			}
		});
		btnNewButton_16.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href16;
			}
		});
		btnNewButton_17.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href17;
			}
		});
		btnNewButton_18.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href18;
			}
		});
		btnNewButton_19.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				search.setVisible(false);
				composite.setVisible(true);
				downloadhref=href19;
			}
		});
	}
	
	
	protected void fileDig(Shell parent){
		//新建文件对话框，并设置为打开的方式
		FileDialog filedlg=new FileDialog(parent,SWT.OPEN);
		//设置文件对话框的标题
		filedlg.setText("文件选择");
		//设置初始路径
		filedlg.setFilterPath("SystemRoot");
		//打开文件对话框，返回选中文件的绝对路径
		String selected=filedlg.open();
		System.out.println("您选中的文件路径为："+selected);
		}
	// b- 显示下载
	public void setVisible(Boolean b,Composite composite,Composite search,Button btnNewButton_1, Button btnNewButton_2, Button btnNewButton_3, Button btnNewButton_30, Button btnNewButton_29, Button btnNewButton_28, Button btnNewButton_27, Button btnNewButton_26, Button btnNewButton_25, Button btnNewButton_24, Button btnNewButton_23, Button btnNewButton_22, Button btnNewButton_21, Button btnNewButton_20, Button btnNewButton_19, Button btnNewButton_18, Button btnNewButton_17, Button btnNewButton_16, Button btnNewButton_15, Button btnNewButton_14, Button btnNewButton_13, Button btnNewButton_12, Button btnNewButton_11, Button btnNewButton_10, Button btnNewButton_9, Button btnNewButton_8, Button btnNewButton_7, Button btnNewButton_6, Button btnNewButton_5, Button btnNewButton_4){
		composite.setVisible(b);
		search.setVisible(!b);
		btnNewButton_1.setVisible(b); 
		btnNewButton_2.setVisible(b) ; 
		btnNewButton_3.setVisible(b) ; 
		btnNewButton_4.setVisible(b) ; 
		btnNewButton_5.setVisible(b) ; 
		btnNewButton_6.setVisible(b) ;
		btnNewButton_7.setVisible(b) ; 
		btnNewButton_8.setVisible(b) ; 
		btnNewButton_9.setVisible(b) ; 
		btnNewButton_10.setVisible(b) ; 
		btnNewButton_11.setVisible(b) ; 
		btnNewButton_12.setVisible(b) ; 
		btnNewButton_13.setVisible(b) ; 
		btnNewButton_14.setVisible(b) ; 
		btnNewButton_15.setVisible(b) ; 
		btnNewButton_16.setVisible(b) ; 
		btnNewButton_17.setVisible(b) ;
		btnNewButton_18.setVisible(b) ;
		btnNewButton_19.setVisible(b) ; 
		btnNewButton_20.setVisible(b) ; 
		btnNewButton_21.setVisible(b) ; 
		btnNewButton_22.setVisible(b) ; 
		btnNewButton_23.setVisible(b) ; 
		btnNewButton_24.setVisible(b) ;
		btnNewButton_25.setVisible(b) ;
		btnNewButton_26.setVisible(b) ;
		btnNewButton_27.setVisible(b) ;
		btnNewButton_28.setVisible(b) ; 
		btnNewButton_29.setVisible(b) ; 
		btnNewButton_30.setVisible(b) ; 
	}
	
}
