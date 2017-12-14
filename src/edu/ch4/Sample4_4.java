package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_4 {
	public static void main(String[] args) {
		Display display = new Display();// 创建一个display对象。
		Shell shell = new Shell(display);// shell是程序的主窗体
		shell.setText("文本框示例");
		Text text1 = new Text(shell, SWT.NONE | SWT.BORDER);// 带边框
		text1.setBounds(10, 10, 70, 30);
		Text text2 = new Text(shell, SWT.PASSWORD);

		text2.setBounds(90, 10, 70, 30);
		Text text3 = new Text(shell, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		text3.setBounds(10, 50, 70, 70);
		Text text4 = new Text(shell, SWT.WRAP | SWT.V_SCROLL);
		text4.setBounds(90, 50, 70, 70);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) { // 如果主窗体没有关闭则一直循环
			if (!display.readAndDispatch()) { // 如果display不忙
				display.sleep(); // 休眠
			}
		}
		display.dispose();
		// 销毁display
	}
}