package java_practice;

public class Practice1 {
	public static void main(String[] args) {
		System.out.println("練習問題1-1");
		System.out.println("Hello World");
		System.out.println("練習問題1-2");
		int x = 11;
		System.out.println("x=" + x);
		System.out.println("練習問題1-3");
		x = 13;
		int y = 17;
		System.out.println("x=" + x + ",y=" + y);
		System.out.println("練習問題1-4");
		x = 13 + 17;
		System.out.println(x);
		System.out.println("練習問題1-5");
		System.out.println(13 * 17);
		System.out.println("練習問題1-6");
		x = 7;
		x *= 3;
		System.out.println(x);
		x /= 2;
		System.out.println(x);
		System.out.println("練習問題1-7");
		x = 3;
		y = 7;
		int xfromy = y;
		y = x;
		x = xfromy;
		System.out.println("x=" + x + ",y=" + y);
		System.out.println("練習問題1-8");
		x = 19;
		y = 23;
		int z = x * y;
		System.out.println(z);
		System.out.println("練習問題1-9");
		x = 9;
		System.out.println(x * 2);
		System.out.println(x * 3);
		System.out.println(x * 4);
		System.out.println("練習問題1-10");
		x = 10;
		System.out.println(x * 1);
		System.out.println(x * x);
		System.out.println(x * x * x);
		System.out.println("練習問題1-11");
		x = 11;
		System.out.println("11を3で割った商：" + (x / 3) + "、余り：" + (x % 3));
		System.out.println("練習問題1-12");
		x = 12;
		x++;
		System.out.println("インクリメント演算子：" + x);
		x--;
		x--;
		System.out.println("デクリメント演算子：" + x);
	}
}
