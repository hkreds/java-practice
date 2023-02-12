package tohoho.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameTest extends JFrame {
	public JFrameTest() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JFrameTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JFrameTest();
	}
}
