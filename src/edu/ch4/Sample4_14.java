package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_14 {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("GridData示例");
		GridLayout gridLayout = new GridLayout();// 创建网格布局对象
		gridLayout.numColumns = 3; // 设置网格布局列数为3
		gridLayout.makeColumnsEqualWidth = true; // 强制列宽相等
		shell.setLayout(gridLayout); // 将shell设置为指定的网格布局式样
		GridData gridData = new GridData(); // 创建网格布局数据对象
		gridData.horizontalSpan = 2; // 水平方向跨2列
		gridData.verticalSpan = 2; // 垂直方向跨2行
		gridData.horizontalAlignment = GridData.CENTER; // 水平方向居中
		gridData.verticalAlignment = GridData.FILL; // 垂直方向充满
		Button b1 = new Button(shell, SWT.PUSH); // 创建按钮对象b1
		b1.setText("B1");
		b1.setLayoutData(gridData); // 将设定的网格布局数据用于按钮对象b1
		new Button(shell, SWT.PUSH).setText("超宽按钮 2");
		new Button(shell, SWT.PUSH).setText("按钮 3");
		Button b4 = new Button(shell, SWT.PUSH);
		b4.setText("B4"); // 用带参数的构造方法创建gridData对象
		gridData = new GridData(GridData.FILL_HORIZONTAL);
		b4.setLayoutData(gridData); // 将gridData用于b4，水平方向充满
		Button b5 = new Button(shell, SWT.PUSH);
		b5.setText("按钮 5");
		gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;// 设置b5为水平方向充满

		b5.setLayoutData(gridData);
		new Button(shell, SWT.PUSH).setText("按钮 6");
		Text t1 = new Text(shell, SWT.BORDER);
		t1.setText("文本框 1");
		gridData = new GridData();
		gridData.verticalSpan = 2; // 跨两行
		gridData.horizontalSpan = 2; // 跨两列
		gridData.verticalAlignment = GridData.FILL; // 垂直方向充满
		gridData.grabExcessVerticalSpace = true; // 抢占垂直方向额外空间
		gridData.horizontalAlignment = GridData.FILL;// 水平方向充满
		gridData.grabExcessHorizontalSpace = true;// 抢占水平方向额外空间
		t1.setLayoutData(gridData); // gridData用于文本框t1
		new Button(shell, SWT.PUSH).setText("按钮 7");
		new Button(shell, SWT.PUSH).setText("按钮 8");

		SWTUtils.open(display, shell);
	}
}