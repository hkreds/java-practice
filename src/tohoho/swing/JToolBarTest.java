package tohoho.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class JToolBarTest extends JFrame implements ActionListener {
	public JToolBarTest() {
		getContentPane().setLayout(new FlowLayout());
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(true);
		getContentPane().add(toolBar, BorderLayout.NORTH);
		JButton btnNew = new JButton(new ImageIcon("new.gif"));
		btnNew.setActionCommand("New");
		btnNew.addActionListener(this);
		toolBar.add(btnNew);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JToolBarTest");	
		setSize(500,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	public static void main(String[] args) {
		new JToolBarTest();
	}
}
