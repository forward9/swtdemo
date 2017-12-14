package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class Sample4_20 {
	static Display display = new Display();
	static final Shell shell = new Shell(display, SWT.SHELL_TRIM);

	public static void main(String[] args) {
		shell.setText("组件选择事件示例");
		Button button = new Button(shell, SWT.PUSH);
		button.setText("请点击我");
		RowLayout layout = new RowLayout();
		layout.marginHeight = 10;
		layout.marginWidth = 20;
		shell.setLayout(layout);
		RowData data = new RowData(80, 40);
		button.setLayoutData(data);
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				MessageBox dialog = new MessageBox(shell, SWT.OK | SWT.ICON_INFORMATION);
				dialog.setText("组件选择事件");
				dialog.setMessage("你好，SWT世界！");
				dialog.open();
			}
		});

		SWTUtils.open(display, shell);
	}
}