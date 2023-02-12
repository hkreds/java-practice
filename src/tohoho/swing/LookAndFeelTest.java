package tohoho.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookAndFeelTest extends JFrame implements ActionListener {
	JButton bMetal = new JButton("Metal");
	JButton bWin = new JButton("Windows");
	JButton bMotif = new JButton("Motif");
	LookAndFeelTest() {
		getContentPane().setLayout(new FlowLayout());
		bMetal.addActionListener(this);
		bWin.addActionListener(this);
		bMotif.addActionListener(this);
		getContentPane().add(bMetal);
		getContentPane().add(bWin);
		getContentPane().add(bMotif);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("LookAndFeelTest");
		setSize(500,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String lookAndFeel = "";
		if (e.getSource() == bMetal) {
			lookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
		} else if (e.getSource() == bWin) {
			lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		} else if (e.getSource() == bMotif) {
			lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
		}
		try {
			UIManager.setLookAndFeel(lookAndFeel);
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String [] args) {
		new LookAndFeelTest();
	}
}
