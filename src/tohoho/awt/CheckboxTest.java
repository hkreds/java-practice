package tohoho.awt;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckboxTest extends Frame {
	public static void main(String[] args) {
		new CheckboxTest();
	}
	public CheckboxTest() {
		super("CheckboxTest");
		setSize(500,200);
		setLayout(new FlowLayout());
		Checkbox c1 = new Checkbox("OK?");
		add(c1);
		show();
	}
}

