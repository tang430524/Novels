package com.ty.book.km;

import java.io.IOException;

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

public class bookv1 {

	protected Shell shell;
	private Text href;
	private Text path;
	private Text name;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			bookv1 window = new bookv1();
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
		shell.setSize(488, 320);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Label tips = new Label(shell, SWT.NONE);
		tips.setLocation(56, 10);
		tips.setSize(377, 17);
		tips.setText("\u6E29\u99A8\u63D0\u793A\uFF1A\u8BF7\u8F93\u5165\u5728\u8981\u4E0B\u8F7D\u5185\u5BB9\u94FE\u63A5\uFF0C\u67E5\u770B\u5168\u90E8\u7AE0\u8282\u7684\u9875\u9762\uFF01\uFF01\uFF01");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(51, 49, 64, 23);
		label.setText("\u7F51\u5740\uFF1A");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(51, 98, 61, 17);
		label_1.setText("\u4FDD\u5B58\u8DEF\u5F84\uFF1A");
		
		href = new Text(shell, SWT.BORDER);
		href.setText("http://book.km.com/chapterlist/155255.html");
		href.setBounds(121, 49, 326, 23);
		
		ProgressBar progressBar = new ProgressBar(shell, SWT.NONE);
		progressBar.setBounds(32, 255, 383, 17);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(430, 255, 42, 17);
		label_2.setText("0%");
		
		Button download = new Button(shell, SWT.NONE);
		download.setBounds(206, 176, 64, 23);
		download.setText("\u4E0B\u8F7D");
		
		
		
		Button pathchoose = new Button(shell, SWT.NONE);
		pathchoose.setBounds(367, 93, 80, 27);
		pathchoose.setText("\u9009\u62E9\u8DEF\u5F84");
		
		path = new Text(shell, SWT.BORDER);
		path.setText("C:\\Users\\Administrator\\Desktop\\");
		path.setBounds(121, 98, 216, 23);
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBounds(51, 138, 61, 17);
		label_3.setText("\u6587\u4EF6\u540D\uFF1A");
		
		name = new Text(shell, SWT.BORDER);
		name.setText("\u65B0\u5EFA\u6587\u672C\u6587\u6863");
		name.setBounds(121, 132, 110, 23);
		
		
		pathchoose.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//�½��ļ��У�Ŀ¼���Ի���
				DirectoryDialog folderdlg=new DirectoryDialog(shell);
				//�����ļ��Ի���ı���
				folderdlg.setText("�ļ�ѡ��");
				//���ó�ʼ·��
				folderdlg.setFilterPath("SystemDrive");
				//���öԻ�����ʾ�ı���Ϣ
				folderdlg.setMessage("��ѡ����Ӧ���ļ���");
				//���ļ��Ի��򣬷���ѡ���ļ���Ŀ¼
				String selecteddir=folderdlg.open();
				if(selecteddir==null){
				return ;
				}
				else{
				System.out.println("��ѡ�е��ļ���Ŀ¼Ϊ��"+selecteddir);
				path.setText(selecteddir);
				}
			}
		});
		/**
		 * ������ص�ʱ��
		 */
		download.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				   String tpath0=path.getText().trim();//·��
					String tname=name.getText().trim();
					final String tpath=tpath0+tname+".txt";
					final String thref=href.getText().trim();//���ص�ַ
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
	}
	
	
	protected void fileDig(Shell parent){
		//�½��ļ��Ի��򣬲�����Ϊ�򿪵ķ�ʽ
		FileDialog filedlg=new FileDialog(parent,SWT.OPEN);
		//�����ļ��Ի���ı���
		filedlg.setText("�ļ�ѡ��");
		//���ó�ʼ·��
		filedlg.setFilterPath("SystemRoot");
		//���ļ��Ի��򣬷���ѡ���ļ��ľ���·��
		String selected=filedlg.open();
		System.out.println("��ѡ�е��ļ�·��Ϊ��"+selected);
		}
}
