package tohoho.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	public JTableTest() {
		getContentPane().setLayout(new FlowLayout());
		JTable tb = new JTable(10,5);
		tb.setValueAt("AAA", 0, 0);
		tb.setValueAt("BBB", 1, 1);
		tb.setValueAt("CCC", 2, 2);
		JScrollPane sp = new JScrollPane(tb);
		sp.setPreferredSize(new Dimension(230,80));
		getContentPane().add(sp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTableTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableTest();
	}
}
