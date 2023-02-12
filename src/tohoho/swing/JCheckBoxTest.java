package tohoho.swing;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JCheckBoxTest extends JFrame implements ChangeListener {
	public JCheckBoxTest() {
		getContentPane().setLayout(new FlowLayout());
		JCheckBox cb = new JCheckBox("Off");
		cb.addChangeListener(this);
		getContentPane().add(cb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest");
		setSize(500,200);
		setVisible(true);
	}
	public void stateChanged(ChangeEvent e) {
		JCheckBox cb = (JCheckBox)e.getSource();
		if (cb.isSelected()) {
			cb.setText("On");
		}else {
			cb.setText("Off");
		}
	}
	public static void main(String[] args) {
		new JCheckBoxTest();
	}
}
