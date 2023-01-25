package future.basic;

public class MethodBasicPractice2 {
	public static void main(String[] args) {
		int a = 18;
		int b = 6;
		// calcメソッドの呼び出し
		System.out.println("足し算：" + calc(a, b, 0));
		System.out.println("引き算：" + calc(a, b, 1));
		System.out.println("掛け算：" + calc(a, b, 2));
		System.out.println("割り算：" + calc(a, b, 3));
	}
	public static int calc(int a,int b, int c) {
		switch(c) {
		case 0:
			return a + b;
		case 1:
			return a - b;
		case 2:
			return a * b;
		case 3:
			return a / b;
		default:
			return 0;
		}
	}
}
