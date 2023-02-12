package tohoho.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DefaultTableModelTest extends JFrame {
	public DefaultTableModelTest() {
		getContentPane().setLayout(new FlowLayout());
		String[][] rowData = {
				{ "A1", "B1", "C1" },
				{ "A2", "B2", "C2" },
				{ "A3", "B3", "C3" },
				{ "A4", "B4", "C4" },
		};
		String[] colNames = {"A", "B", "C"};
		DefaultTableModel tm = new DefaultTableModel(rowData, colNames);
		JTable tb = new JTable(tm);
		JScrollPane sp = new JScrollPane(tb);
		sp.setPreferredSize(new Dimension(230,80));
		getContentPane().add(sp);
		String[] data = {"A5", "B5", "C5"};
		tm.addRow(data);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("DefaultTableModelTest");
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DefaultTableModelTest();
	}
}
