package tohoho.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class JScrollBarTest extends JFrame implements AdjustmentListener {
	public JScrollBarTest() {
		getContentPane().setLayout(new FlowLayout());
		JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL, 30, 5, 0, 105);
		sb.setPreferredSize(new Dimension(150, 17));
		sb.addAdjustmentListener(this);
		getContentPane().add(sb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JScrollBarTest");
		setSize(500,200);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
		JScrollBar sb = (JScrollBar)e.getSource();
		System.out.println(sb.getValue());
	}
	public static void main(String[] args) {
		new JScrollBarTest();
	}
}
