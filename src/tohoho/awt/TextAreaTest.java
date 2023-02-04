package tohoho.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaTest extends Frame{
	public static void main(String[] args) {
		new TextAreaTest();
	}
	public TextAreaTest() {
		super("TextAreaTest");
		setSize(500,200);
		setLayout(new FlowLayout());
		TextArea b1 = new TextArea("Hello World!!",3,20);
		add(b1);
		show();
	}
}
