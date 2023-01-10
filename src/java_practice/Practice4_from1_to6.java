package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_from1_to6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題4-1");
		for(int i = 1; i <= 10; i++) {
			System.out.println("SPAM");
		}
		
		System.out.println("練習問題4-2");
		for(int i = 1; i <= 9; i++) {
			System.out.println(3 * i);
		}
		
		System.out.println("練習問題4-3");
		int point = 2;
		for(int i = 1; i <= 8; i++) {
			System.out.println(point);
			point *= 2;
		}
		
		System.out.println("練習問題4-4");
		point = 1;
		for(int i = 1; i <= 7; i++) {
			point *= i;
		}
		System.out.println(point);
		
		System.out.println("練習問題4-5");
		point = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("整数を入力してください" + i + "回目：");
			int add = Integer.parseInt(br.readLine());
			point += add;
		}
		System.out.println("平均値：" + point/10);
		
		System.out.println("練習問題4-6");
		int win = 0;
		int lose = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("対戦成績を入力(0:負け、1:勝ち)" + i + "回目：");
			int result = Integer.parseInt(br.readLine());
			if (result == 0) {
				lose += 1;
			}else if(result == 1) {
				win += 1;
			}
		}
		System.out.println(win + "勝" + lose + "敗");
	}
}
