package week.exproblem1;

import java.util.Scanner;

public class Problem1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = (int)(Math.random() * 10)  + 1;
		int b = (int)(Math.random() * 10)  + 1;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.print("c = ");
		int c = Integer.parseInt(scanner.nextLine());
		int result = mul(a,b,c);
		System.out.println(a + " * " + b + " * " + c + " = " + result);
	}
	static int mul(int a,int b,int c){
		return a * b * c;
	}
}
