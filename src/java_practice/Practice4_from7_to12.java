package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_from7_to12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題4-7");
		int kyozin_score = 0;
		int hanshin_score = 0;
		for(int i=1;i<=9;i++) {
			System.out.print(i + "回表、巨人の得点は？ ");
			kyozin_score += Integer.parseInt(br.readLine());
			System.out.print(i + "回裏、阪神の得点は？ ");
			hanshin_score += Integer.parseInt(br.readLine());
		}
		System.out.println("巨人：" + kyozin_score + "点，阪神：" + hanshin_score + "点");
		if(kyozin_score>hanshin_score) {
			System.out.println("巨人の勝ち");
		}else if (hanshin_score>kyozin_score) {
			System.out.println("阪神の勝ち");
		}else {
			System.out.println("引分け");
		}
		
		System.out.println("練習問題4-8");
		int max_num = 0;
		for(int i=1;i<=10;i++) {
			System.out.print("整数を入力" + i + "回目：");
			int num = Integer.parseInt(br.readLine());
			if(max_num<num) {
				max_num = num;			}
		}
		System.out.println("最大値：" + max_num);
		
		System.out.println("練習問題4-9");
		System.out.print("整数を入力 1回目：");
		int num_max = Integer.parseInt(br.readLine());
		int num_min = num_max;
		for(int i=2;i<=10;i++) {
			System.out.print("整数を入力 " + i + "回目：");
			int number = Integer.parseInt(br.readLine());
			if(num_max<number){
				num_max = number;
			}else if (num_min>number) {
				num_min = number;
			}
		}
		System.out.println("最大値：" + num_max + "、最小値：" + num_min);

		System.out.println("練習問題4-10");
		System.out.print("*の表示個数：");
		int times = Integer.parseInt(br.readLine());
		for(int i=1;i<=times;i++) {
			System.out.print("*");
		}

		System.out.println("練習問題4-11");
		System.out.print("表示個数を入力：");
		int x = Integer.parseInt(br.readLine());
		for(int i=0,count=0;count<x;i++,count++) {
			if(i<=9) {
				System.out.print(i);
			}else {
				i = 0;
				System.out.print(i);
			}
		}

		System.out.println("練習問題4-12");
		int sum = 0;
		while (sum<=100) {
			System.out.print("数値を入力：");
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println("合計：" + sum);
	}
}
