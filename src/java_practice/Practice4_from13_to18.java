package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_from13_to18 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("練習問題4-13");
//		int strike = 0, ball = 0;
//		while (strike<3 && ball<4) {
//			System.out.print("ストライク=1 or ボール=2 ？ ");
//			int pitch = Integer.parseInt(br.readLine());
//			if (pitch==1) {
//				strike += 1;
//			}else if (pitch==2) {
//				ball += 1;
//			}
//		}
//		System.out.println(ball + "ボール," + strike + "ストライク");
//		
//		System.out.println("練習問題4-14");
//		strike = 0;
//		ball = 0;
//		while (strike<3 && ball<4) {
//			System.out.print("ストライク=1 or ボール=2 or ファウル=3 ？ ");
//			int pitch = Integer.parseInt(br.readLine());
//			if (pitch==1) {
//				strike += 1;
//			}else if (pitch==2) {
//				ball += 1;
//			}else if (pitch==3) {
//				if (strike<2) {
//					strike += 1;
//				}
//			}
//		}
//		System.out.println(ball + "ボール," + strike + "ストライク");
//		
//		System.out.println("練習問題4-15");
//		System.out.print("数値を入力：");
//		int n = Integer.parseInt(br.readLine());
//		int sosuu_judge = 0;
//		for(int i=2;i<n;i++) {
//			if (n%i==0) {
//				sosuu_judge += 1;
//				break;
//			}
//		}
//		if(sosuu_judge==0) {
//			System.out.println(n + "は素数である。");
//		}else{
//			System.out.println(n + "は素数でない。");
//		}
//		
//		System.out.println("練習問題4-16");
//		System.out.print("数値を入力：");
//		n = Integer.parseInt(br.readLine());
//		int i = 2;
//		while (i<=n) {
//			if(n%i==0) {
//				n /= i;
//				System.out.print(i + " ");
//			}else {
//				i++;
//			}
//		}
//		
//		System.out.println("練習問題4-17");
//		for(int y=1;y<=9;y++) {
//			for(int x=1;x<=9;x++) {
//				System.out.printf(" %2d", x * y );
//			}
//			System.out.println();
//		}
//		
		System.out.println("練習問題4-18");
		int i = 1;
		int sum = 0;
		while (i !=0) {
			System.out.print("数値を入力：");
			i = Integer.parseInt(br.readLine());
			sum += i;
		}
		System.out.println(sum);
	}
}
