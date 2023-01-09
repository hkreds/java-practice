package java_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_from7_to13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("練習問題3-7");
		System.out.print("試験の点数を入力");
		int score = Integer.parseInt(br.readLine());
		System.out.print("ケース1:");
		if(score>=60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		System.out.print("ケース2:");
		if (score>=80) {
			System.out.println("たいへんよくできました。");
		}else if (score>=60) {
			System.out.println("よくできました。");
		}else {
			System.out.println("ざんねんでした。");
		}
		System.out.print("ケース3:");
		if (score>=80) {
			System.out.println("優");
		}else if (score>=70) {
			System.out.println("良");
		}else if (score>=60){
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		
		System.out.println("練習問題3-8");
		System.out.print("中間試験の点数を入力:");
		int tyuukan_score = Integer.parseInt(br.readLine());
		System.out.print("期末試験の点数を入力:");
		int kimatu_score = Integer.parseInt(br.readLine());
		if ((tyuukan_score>=60 && kimatu_score>= 60) || (tyuukan_score+kimatu_score>=130) || (tyuukan_score+kimatu_score>=100 && (tyuukan_score>=90 || kimatu_score>=90))){
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		System.out.println("練習問題3-9");
		System.out.print("曜日の入力(0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜):");
		int day = Integer.parseInt(br.readLine());
		System.out.print("時間帯の入力(0=午前、1=午後、2=夜間):");
		int time = Integer.parseInt(br.readLine());
		if(day==0 || (day==2&&time==0) || (day==3&&time==2) || (day==5&&time!=0)) {
			System.out.println("休診");
		}else {
			System.err.println("開いている");
		}
		
		System.out.println("終わり");
	}
}
