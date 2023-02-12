package tohoho.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame {
	JPanelTest() {
		getContentPane().setLayout(new GridLayout(1, 2));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p1.add(b1, BorderLayout.CENTER);
		p2.add(b2, BorderLayout.NORTH);
		p2.add(b3, BorderLayout.CENTER);
		p2.add(b4, BorderLayout.SOUTH);
		getContentPane().add(p1);
		getContentPane().add(p2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JPanelTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPanelTest();
	}
}
