package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6 {
	static int nizyou(int i) {
		return i*i;
	}
	static int ave(int a,int b) {
		return (a+b)/2;
	}
	static int large(int a,int b) {
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	static void triangle(int a) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("$");				
			}
			System.out.println();
		}
	}
	static void triangle2(int a,char b) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(b);				
			}
			System.out.println();
		}
	}
	static void kuku(int a) {
		for(int i=1;i<=9;i++) {
			System.out.printf(" %2d", a*i);
		}
		System.out.println();
	}
	static void sosuu(int a,int b) {
		for(int i=a;i<=b;i++) {
			int judge = 0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					judge = 1;
				}
			}
			if(judge==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	static void fibonacci(int a,int b) {
		int x = 0;
		int y = 1;
		int z = x + y;
		int h = 0;
		for(int i=2;i<=b+2;i++) {
			if(i>a+1 && i<=b+2) {
				System.out.print(x + " ");
			}
			h = x;
			x = y;
			y = z;
			z = x + y;
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題6-1");
		System.out.println(nizyou(3));
		
		System.out.println("練習問題6-2");
		System.out.println(ave(3,7));
		
//		System.out.println("練習問題6-3");
//		System.out.print("整数を3つ入力(1つ目)：");
//		int x = Integer.parseInt(br.readLine());
//		System.out.print("整数を3つ入力(2つ目)：");
//		int y = Integer.parseInt(br.readLine());
//		System.out.print("整数を3つ入力(3つ目)：");
//		int z = Integer.parseInt(br.readLine());
//		System.out.println(large(x,large(y,z)));

		System.out.println("練習問題6-4");
		triangle(3);
		triangle(4);
		triangle(5);
		
		System.out.println("練習問題6-5");
		triangle2(3,'a');
		triangle2(4,'b');
		triangle2(5,'c');
		
		System.out.println("練習問題6-6");
		kuku(3);
		
		System.out.println("練習問題6-7");
		sosuu(10000,10100);
		
		System.out.println("練習問題6-8");
		fibonacci(0,20);
	}
}
