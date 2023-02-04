package tohoho.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class TextFeildTest extends Frame {
	public static void main(String[] args) {
		new TextFeildTest();
	}
	TextFeildTest() {
		super("TextFeildTest");
		setSize(500,200);
		setLayout(new FlowLayout());
		TextField t1 = new TextField("Hello World!!");
		add(t1);
		show();
	}
}
