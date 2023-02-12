package tohoho.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTest extends JFrame implements ListSelectionListener {
	public JListTest() {
		getContentPane().setLayout(new FlowLayout());
		String[] data = {"ListA", "ListB", "ListC", "ListD"};
		JList lst = new JList(data);
		lst.addListSelectionListener(this);
		getContentPane().add(lst);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JListTest");
		setSize(500,200);
		setVisible(true);
	}
	public void valueChanged(ListSelectionEvent e) {
		JList lst = (JList)e.getSource();
		System.out.println(lst.getSelectedValue());
	}
	public static void main(String[] args) {
		new JListTest();
	}
}
