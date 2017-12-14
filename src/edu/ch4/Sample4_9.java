package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_9 {
	public static void main(String[] args) {
		Display display = new Display();// 创建一个display对象。
		final Shell shell = new Shell(display);// shell是程序的主窗体
		shell.setText("分组框示例");
		Group group1 = new Group(shell, SWT.NONE); // 创建分组框
		group1.setText("录入信息"); // 设置分组框说明信息
		group1.setBounds(10, 20, 200, 100);
		Label lb1 = new Label(group1, SWT.NONE); // 在分组框中加入组件
		lb1.setText("姓名：");
		lb1.setBounds(10, 20, 70, 20);
		Text text1 = new Text(group1, SWT.BORDER);
		text1.setBounds(90, 20, 70, 20);
		Label lb2 = new Label(group1, SWT.NONE);
		lb2.setText("地址：");
		lb2.setBounds(10, 50, 70, 20);
		Text text2 = new Text(group1, SWT.BORDER);
		text2.setBounds(90, 50, 70, 20);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) { // 如果主窗体没有关闭则一直循环
			if (!display.readAndDispatch()) { // 如果display不忙
				display.sleep(); // 休眠
			}
		}
		display.dispose(); // 销毁display
	}
}
