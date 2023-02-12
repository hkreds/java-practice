package tohoho.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest extends JFrame implements ActionListener {
	public JComboBoxTest() {
		getContentPane().setLayout(new FlowLayout());
		JComboBox cb = new JComboBox();
		cb.addItem("ComboA");
		cb.addItem("ComboB");
		cb.addItem("ComboC");
		cb.addActionListener(this);
		getContentPane().add(cb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JComboBoxTest");
		setSize(500,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		System.out.println(cb.getSelectedItem());
	}
	public static void main(String[] args) {
		new JComboBoxTest();
	}
}
