package week.problem8;

public class Problem8_10 {
	public static void main(String[] args) {
		System.out.println("フィボナッチ数列");
		int a = 1;
		int b = 1;
		int c = a + b;
		System.out.print(a+" "+b+" ");
		while(c<=40) {
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println();
		System.out.println("トリボナッチ数列");
		a = 1;
		b = 1;
		c = 2;
		int d = a+b+c;
		System.out.print(a+" "+b+" "+c+" ");
		while(d<=30) {
			System.out.print(d+" ");
			a = b;
			b = c;
			c = d;
			d = a+b+c;
		}
	}
}
