package tohoho.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class LabelTest extends Frame {
	public static void main(String[] args) {
		new LabelTest();
	}
	LabelTest() {
		super("LabelTest");
		setSize(500,200);
		setLayout(new FlowLayout());
		Label l1 = new Label("HelloWorld!!");
		add(l1);
		show();
	}
}
