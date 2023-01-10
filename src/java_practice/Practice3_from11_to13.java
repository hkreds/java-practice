package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_from11_to13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題3-11");
		System.out.print("月を表す数値を入力：");
		int month = Integer.parseInt(br.readLine());
		switch(month) {
		case 1:
			System.out.println("元日、成人の日");
			break;
		case 2:
			System.out.println("建国記念の日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日、みどりの日、こどもの日");
			break;
		case 7:
			System.out.println("海の日");
			break;
		case 9:
			System.out.println("敬老の日、秋分の日");
			break;
		case 10:
			System.out.println("体育の日");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("天皇誕生日");
			break;
		}
		
		System.out.println("練習問題3-12");
		System.out.print("好きな鮨ネタを選択（1：まぐろ　2：えび　3：こはだ）：");
		int sushi = Integer.parseInt(br.readLine());
		switch(sushi) {
		case 1:
			System.out.println("情熱的");
			break;
		case 2:
			System.out.println("明るい");
			break;
		case 3:
			System.out.println("冷静");
			break;
		}
		
		System.out.println("練習問題3-13");
		System.out.print("月を入力(1～12)：");
		month = Integer.parseInt(br.readLine());
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31);
			break;
		case 2:
			System.out.println(28);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(30);
			break;
		default:
			System.out.println("入力が間違っています");
		}
	}
}
