package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題2-1");
		System.out.print("String 型の変数 s に文字列を入力：");
		String s = br.readLine();
		System.out.println("s=" + s);
		
		System.out.println("練習問題2-2");
		System.out.print("int 型の変数 x に数値を入力：");
		int x = Integer.parseInt(br.readLine());
		System.out.println("x=" + x);

		System.out.println("練習問題2-3");
		System.out.print("int 型の変数 x に数値を入力：");
		x = Integer.parseInt(br.readLine());
		System.out.println("xの1乗" + x);
		System.out.println("xの2乗" + x * x);
		System.out.println("xの3乗" + x * x * x);

		System.out.println("練習問題2-4");
		System.out.print("int 型の変数 x に数値を入力：");
		x = Integer.parseInt(br.readLine());
		System.out.print("int 型の変数 y に数値を入力：");
		int y = Integer.parseInt(br.readLine());
		System.out.println("x+y=" + (x+y) + ", x-y=" + (x-y) + ", x*y=" + (x*y) + ", x÷y=商：" + (x/y) + ",余り:" + (x%y));

		System.out.println("練習問題2-5");
		System.out.print("一つ目の整数を入力：");
		int a = Integer.parseInt(br.readLine());
		System.out.print("二つ目の整数を入力：");
		int b = Integer.parseInt(br.readLine());
		System.out.println("平均値:" + ((a+b)/2));
		
		System.out.println("練習問題2-6");
		System.out.print("年齢を入力：");
		int age = Integer.parseInt(br.readLine());
		System.out.println("生まれてから現在までの、おおよその日数:" + age * 365);
	}
}
