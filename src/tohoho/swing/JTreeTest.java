package tohoho.swing;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeTest extends JFrame implements TreeSelectionListener {
	DefaultMutableTreeNode nRoot = new DefaultMutableTreeNode("top");
	DefaultMutableTreeNode nJapan = new DefaultMutableTreeNode("Japan");
	DefaultMutableTreeNode nUsa = new DefaultMutableTreeNode("USA");
	DefaultMutableTreeNode nKantoh = new DefaultMutableTreeNode("Kantoh");
	DefaultMutableTreeNode nKansai = new DefaultMutableTreeNode("Kansai");
	DefaultMutableTreeNode nTokyo = new DefaultMutableTreeNode("Tokyo");
	JTreeTest() {
		JTree tree = new JTree(nRoot);
		tree.setRootVisible(true);
		tree.addTreeSelectionListener(this);
		getContentPane().add(tree);
		nRoot.add(nJapan);
		nRoot.add(nUsa);
		nJapan.add(nKantoh);
		nJapan.add(nKansai);
		nKantoh.add(nTokyo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTreeTest");
		setSize(500,200);
		setVisible(true);
	}
	public void valueChanged(TreeSelectionEvent e) {
		JTree tree = (JTree)e.getSource();
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
		if (node != null) {
			System.out.println((String)node.getUserObject());
		}
	}
	public static void main(String[] args) {
		new JTreeTest();
	}
}

