package tohoho.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest extends JFrame {
	public JLabelTest() {
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("Hello World!!");
		getContentPane().add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JlabelTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JLabelTest();
	}
}
