package tohoho.swing;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogTest extends JFrame {
	JDialogTest() {
		getContentPane().setLayout(new FlowLayout());
		MyDialog dlg = new MyDialog(this);
		dlg.show();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JDialogTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JDialogTest();
	}
}

class MyDialog extends JDialog implements ActionListener {
	MyDialog(Frame owner) {
		super(owner);
		getContentPane().setLayout(new FlowLayout());
		JButton btn = new JButton("OK");
		btn.addActionListener(this);
		getContentPane().add(btn);
		setTitle("MyDialog");
		setSize(300,150);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		hide();
	}
}
