package tohoho.awt;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarTest extends Frame {
	public static void main(String[] args) {
		new ScrollbarTest();
	}
	ScrollbarTest() {
		super("ScrollbarTest");
		setSize(500,200);
		setLayout(new BorderLayout());
		Scrollbar sb1 = new Scrollbar(Scrollbar.HORIZONTAL);
		add(sb1, BorderLayout.SOUTH);
		show();
	}
}
