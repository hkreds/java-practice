package tohoho.awt;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceTest extends Frame {
	public static void main(String[] args) {
		new ChoiceTest();
	}
	ChoiceTest() {
		super("ChoiceTest");
		setSize(500,200);
		setLayout(new FlowLayout());
		Choice c1 = new Choice();
		c1.add("ChoiceA");
		c1.add("ChoiceB");
		c1.add("ChoiceC");
		add(c1);
		show();
	}
}
