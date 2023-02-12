package tohoho.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarTest extends JFrame {
	public JProgressBarTest() {
		getContentPane().setLayout(new FlowLayout());
		JProgressBar pb = new JProgressBar(1, 100);
		pb.setValue(50);
		getContentPane().add(pb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBarTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JProgressBarTest();
	}
}
