package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//数字あてゲーム(1～100)
public class Kazuate {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = (int) (Math.random()*100)+1;
		int count = 1;
		System.out.println("*******数字あてゲーム*******");
		System.out.println("1～100の数字を入力し、当ててください。");
		while(true) {
			try {
				System.out.print(count+"回目の入力：");
				int n = Integer.parseInt(br.readLine());
				if(n==answer) {
					System.out.println("正解しました。");
					break;
				}else if (n>answer) {
					System.out.println("答えは"+n+"より小さい数字です。");
				}else if (n<answer) {
					System.out.println("答えは"+n+"より大きい数字です。");
				}
				count++;
			} catch (Exception e) {
				System.out.println("数字を入力してください。");
			}
			
		}
	}
}
