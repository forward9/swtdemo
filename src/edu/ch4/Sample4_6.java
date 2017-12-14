package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class Sample4_6 {
	private static Label lb;

	public static void main(String[] args) {
		Display display = new Display();// 创建一个display对象。
		final Shell shell = new Shell(display);// shell是程序的主窗体
		shell.setText("列表框示例");

		final List list = new List(shell, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER); // 声明一个可复选、带垂直滚动条、有边框的列表框。
		list.setBounds(10, 10, 100, 50);

		lb = new Label(shell, SWT.WRAP);
		lb.setBounds(120, 10, 90, 50);

		Button bt1 = new Button(shell, SWT.NONE);
		bt1.setBounds(20, 60, 100, 25);
		bt1.setText("设值");
		bt1.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				list.removeAll();
				for (int i = 1; i <= 8; i++) {
					list.add("第" + i + "项"); // 将选项循环加入到列表框中
				}
				list.select(0);
			}
		});

		Button bt2 = new Button(shell, SWT.NONE);
		bt2.setBounds(130, 60, 100, 25);
		bt2.setText("取值");
		bt2.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				String[] selected = list.getSelection(); // 声明字符串数组保存选项
				String outStr = " ";
				for (int j = 0; j < selected.length; j++) {
					outStr = outStr + " " + selected[j]; // 将数组中的选项加入到输出字符串
				}
				lb.setText("你选择的是：" + outStr);
			}
		});

		SWTUtils.open(display, shell);
	}
}