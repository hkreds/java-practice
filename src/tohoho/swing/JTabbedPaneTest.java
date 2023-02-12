package tohoho.swing;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPaneTest extends JFrame implements ChangeListener {
	JTree tree = new JTree();
	JTable table = new JTable(3, 3);
	JTabbedPaneTest() {
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("AAA", tree);
		tabbedPane.add("BBB", table);
		tabbedPane.addChangeListener(this);
		getContentPane().add(tabbedPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTabbedPaneTest");
		setSize(500,200);
		setVisible(true);
	}
	public void stateChanged(ChangeEvent e) {
		JTabbedPane t = (JTabbedPane)e.getSource();
		if (t.getSelectedComponent() == tree) {
			System.out.println("Tree");
		} else {
			System.out.println("Table");
		}
	}
	public static void main(String args[]) {
		new JTabbedPaneTest();
	}
}
