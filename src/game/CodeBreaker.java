package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeBreaker {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String title = "*** CodeBreaker ***";// タイトル
		String rule = "隠された3つの数字をあてます。\n"
				+ "1つの数字は1から6の間です。\n"
				+ "3つの答えの中に同じ数字はありません。\n"
				+ "入力した数字の、位置と数字が当たってたらヒット、\n"
				+ "数字だけあってたらブローとカウントします。\n"
				+ "全部当てたら(3つともヒットになったら)終了です\n";
		System.out.println(title);
		System.out.println(rule);
		int hit=0,blow=0,count=0;
		int[] answer = new int[3];
		int[] input = new int[3];
		for(int i=0;i<3;i++) {
			answer[i] = (int)(Math.random()*6)+1;
			if(i==1) {
				while(answer[0]==answer[1]) {
					answer[i] = (int)(Math.random()*6)+1;
				}
			}else if (i==2) {
				while(answer[0]==answer[2]||answer[1]==answer[2]) {
					answer[i] = (int)(Math.random()*6)+1;
				}
			}
		}
		System.out.println();
		while (true) {
			count++;
			System.out.println("*** "+count + "回目 ***");
			for (int i = 0; i < answer.length; i++) {
				System.out.print( (i + 1) + "個目 : ");
				try {
					input[i] = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					System.err.println("数値を入力してください");
					i--;
				} catch (IOException e) {
					System.err.println("もう一度入力してください");
					i--;
				}
			}
			hit = 0;
			blow = 0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j&&input[i]==answer[j]) {
						hit++;
					}else if (input[i]==answer[j]) {
						blow++;
					}
				}
			}
			System.out.println("ヒット" + hit + " ブロー" + blow);
			if (hit == 3) {
				System.out.println("おめでとー");
				break;
			}else{
				System.out.println();
			}
		}
	}
}

