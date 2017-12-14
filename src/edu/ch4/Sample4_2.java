package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_2 {
	public static void main(String[] args) {
		Display display = new Display();// 创建一个display对象。
		Shell shell = new Shell(display);// shell是程序的主窗体
		// shell.setLayout(null); //设置shell的布局方式
		shell.setText("按钮示例"); // 设置主窗体的标题

		Button bt1 = new Button(shell, SWT.NULL); // 创建默认按钮
		bt1.setText("SWT.NULL"); // 设置按钮上的文字
		bt1.setBounds(10, 10, 75, 30); // 设置按钮显示位置及宽度、高度

		Button bt2 = new Button(shell, SWT.PUSH | SWT.BORDER); // 创建深陷型按钮
		bt2.setText("SWT.PUSH");
		bt2.setBounds(90, 10, 75, 30);

		Button check1 = new Button(shell, SWT.CHECK);// 创建复选按钮
		check1.setText("SWT.CHECK");
		check1.setBounds(10, 50, 75, 30);

		Button check2 = new Button(shell, SWT.CHECK | SWT.BORDER);// 创建深陷型复选按钮
		check2.setText("SWT.CHECK");
		check2.setBounds(90, 50, 75, 30);

		Button radio1 = new Button(shell, SWT.RADIO);// 创建单选按钮
		radio1.setText("SWT.RADIO");
		radio1.setBounds(10, 90, 75, 30);

		Button radio2 = new Button(shell, SWT.RADIO | SWT.BORDER);// 创建深陷型单选按钮
		radio2.setText("SWT.RADIO");
		radio2.setBounds(90, 90, 75, 30);

		Button arrowLeft = new Button(shell, SWT.ARROW | SWT.LEFT);// 创建箭头按钮（向左）
		arrowLeft.setBounds(10, 130, 75, 20);

		Button arrowRight = new Button(shell, SWT.ARROW | SWT.RIGHT | SWT.BORDER);
		arrowRight.setBounds(90, 130, 75, 20);

		shell.pack(); // 自动调整主窗体的大小
		shell.open(); // 打开主窗体
		while (!shell.isDisposed()) { // 如果主窗体没有关闭
			if (!display.readAndDispatch()) { // 如果display不忙
				display.sleep(); // 休眠
			}
		}
		display.dispose(); // 销毁display
	}
}