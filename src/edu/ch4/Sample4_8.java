package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Sample4_8 {
	public static void main(String[] args) {
		Display display = new Display();// 创建一个display对象。
		final Shell shell = new Shell(display);// shell是程序的主窗体
		shell.setText("容器示例");
		Composite composite1 = new Composite(shell, SWT.NONE);
		composite1.setBounds(10, 10, 100, 50);
		Composite composite2 = new Composite(shell, SWT.BORDER);
		composite2.setBounds(120, 10, 100, 50);
		Label lb1 = new Label(composite1, SWT.NONE);
		lb1.setText("面板1");
		lb1.pack();
		Label lb2 = new Label(composite2, SWT.NONE);
		lb2.setText("面板2");
		lb2.pack();
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