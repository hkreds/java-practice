package tohoho.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaTest extends JFrame {
	public JTextAreaTest() {
		getContentPane().setLayout(new FlowLayout());
		JTextArea ta = new JTextArea("Hello World!!", 4, 15);
		getContentPane().add(ta);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JTextAreaTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
