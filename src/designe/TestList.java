package designe;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class TestList {

	protected Shell shell;
	private Table table;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TestList window = new TestList();
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
		shell.setSize(488, 420);
		shell.setText("SWT Application");

		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		MenuItem mntmNewItem = new MenuItem(menu, SWT.CASCADE);
		mntmNewItem.setText("New Item");

		Menu menu_1 = new Menu(mntmNewItem);
		mntmNewItem.setMenu(menu_1);

		MenuItem mntmNewItem_1 = new MenuItem(menu, SWT.NONE);
		mntmNewItem_1.setText("New Item");

		List list = new List(shell, SWT.BORDER);
		list.setBounds(38, 38, 76, 184);

		List list_1 = new List(shell, SWT.BORDER);
		list_1.setBounds(120, 38, 254, 184);

		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(73, 261, 287, 75);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("字段名");
		TableColumn tblclmnNewColumn1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn1.setWidth(100);
		tblclmnNewColumn1.setText("字段类型");
		TableColumn tblclmnNewColumn2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn2.setWidth(50);
		tblclmnNewColumn2.setText("字段");

		for (int i = 0; i < 5; i++) {
			list.add("table" + i);
		}
		list.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// MessageBox mbox = new MessageBox(shell);
				// mbox.setMessage(list.getSelection()[0]);
				// mbox.open();
				list_1.removeAll();
				for (int i = 0; i < 10; i++) {
					list_1.add(list.getSelection()[0] + " column" + i);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}
}
