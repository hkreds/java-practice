package tohoho.swing;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.JTree;

public class JSplitPaneTest extends JFrame {
	public JSplitPaneTest() {
		String[] data = {"A", "B", "C"};
		JTree tree = new JTree();
		JList list = new JList(data);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(5);
		splitPane.setLeftComponent(tree);
		splitPane.setRightComponent(list);
		getContentPane().add(splitPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JSplitPaneTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JSplitPaneTest();
	}
}
