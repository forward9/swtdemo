package edu.ch4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Sample4_19 {
	Text text1, text2;

	public Sample4_19() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		shell.setLayout(layout);
		shell.setText("Event demo");

		Label label1 = new Label(shell, SWT.RIGHT);
		label1.setText("text1:");
		text1 = new Text(shell, SWT.BORDER | SWT.WRAP);
		GridData gridData1 = new GridData(100, 30);
		text1.setLayoutData(gridData1);
		text1.addKeyListener(new KeyAdapter() { // 添加按键监听器于text1上
			public void keyPressed(KeyEvent e) { // 监听键盘按键
				if (e.keyCode == SWT.CR) // 当按键为回车键时触发
					text2.setText(text1.getText());
			}
		});
		Label label2 = new Label(shell, SWT.RIGHT);
		label2.setText("text2:");
		text2 = new Text(shell, SWT.BORDER | SWT.WRAP);
		GridData gridData2 = new GridData(100, 30);
		text2.setLayoutData(gridData2);
		text2.setEditable(false);
		text2.setBackground(new Color(display, 255, 255, 0));

		SWTUtils.open(display, shell);
	}

	public static void main(String[] args) {
		new Sample4_19();
	}
}