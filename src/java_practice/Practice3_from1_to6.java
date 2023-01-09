package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_from1_to6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題3-1");
		System.out.print("xを入力:");
		int x = Integer.parseInt(br.readLine());
		System.out.print("yを入力:");
		int y = Integer.parseInt(br.readLine());
		if(x>y) {
			System.out.println("xはyより大きい。");
		}

		System.out.println("練習問題3-2");
		System.out.print("xを入力:");
		x = Integer.parseInt(br.readLine());
		System.out.print("yを入力:");
		y = Integer.parseInt(br.readLine());
		System.out.print("大きい数字を表示:");
		if(x>=y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}

		System.out.println("練習問題3-3");
		System.out.print("xを入力:");
		x = Integer.parseInt(br.readLine());
		System.out.print("yを入力:");
		y = Integer.parseInt(br.readLine());
		if(x>y) {
			System.out.println("xはyより大きい");
		}else if(x<y) {
			System.out.println("xはyより小さい");
		}
		
		System.out.println("練習問題3-4");
		System.out.print("xを入力:");
		x = Integer.parseInt(br.readLine());
		System.out.print("yを入力:");
		y = Integer.parseInt(br.readLine());
		if(x>y) {
			System.out.println("xはyより大きい");
		}else if(x<y) {
			System.out.println("xはyより小さい");
		}else if(x==y) {
			System.out.println("xとyは等しい");
		}
		
		System.out.println("練習問題3-5");
		System.out.print("正の整数値を入力:");
		x = Integer.parseInt(br.readLine());
		System.out.print("奇数か偶数かの判定：");
		if(x%2==0) {
			System.out.println("偶数");
		}else if(x%2==1){
			System.out.println("奇数");
		}

		System.out.println("練習問題3-6");
		System.out.print("整数値を入力:");
		x = Integer.parseInt(br.readLine());
		System.out.print("奇数か偶数かと正か負かの判定：");
		if(x%2==0) {
			if(x>=0) {
				System.out.println("正の偶数");
			}else{
				System.out.println("負の偶数");
			}
		}else{
			if (x>=0) {
				System.out.println("正の奇数");
			}else{
				System.out.println("負の奇数");
			}
		}
	}
}
