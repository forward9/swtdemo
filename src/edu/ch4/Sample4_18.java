package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_18 {
	static Text text;

	public static void main(String[] args) {
		Display display = new Display();
		final Shell shell = new Shell(display);

		RowLayout rowLayout = new RowLayout();
		rowLayout.marginWidth = 20;
		rowLayout.marginHeight = 30;
		shell.setLayout(rowLayout);
		shell.setText("SWT事件处理示例");

		text = new Text(shell, SWT.BORDER | SWT.WRAP);
		RowData rowData = new RowData();
		rowData.width = 100;
		rowData.height = 50;
		text.setLayoutData(rowData); // 将鼠标监听器用于text组件
		text.addMouseListener(new MouseAdapter() { // 采用鼠标监听适配器
			public void mouseDoubleClick(MouseEvent e) { // 监听鼠标双击事件的方法
				text.setText("文本框中鼠标双击事件发生！"); // 在text中显示信息 //声明信息对话框对象，并在对话框中显示信息
				MessageBox dialog = new MessageBox(shell, SWT.OK | SWT.ICON_INFORMATION);
				dialog.setText("Double click");
				dialog.setMessage("文本框中鼠标双击事件发生！");
				dialog.open();
			}
		});

		SWTUtils.open(display, shell);
	}
}