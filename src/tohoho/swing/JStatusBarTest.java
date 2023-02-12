package tohoho.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JStatusBarTest extends JFrame {
	JStatusBarTest() {
		getContentPane().setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.CENTER);
		JLabel statusBar = new JLabel("Ready.");
		getContentPane().add(statusBar, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JStatusBarTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String args[]) {
		new JStatusBarTest();
	}
}
