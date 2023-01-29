package future.object_oriented3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListBasicPractice {
	public static void main(String[] args) throws IOException {
		// 英数字単語格納用変数の宣言とArrayListオブジェクトの生成
		ArrayList<String> number = new ArrayList<String>();
		// 英数字単語の格納
		number.add("zero");
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		number.add("five");
		number.add("six");
		number.add("seven");
		number.add("eight");
		number.add("nine");
		number.add("ten");
		// 英単語の入力
		System.out.println("0から10までの英単語を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		// ここからコーディングしてください
		for (int i=0;i<number.size();i++) {
			if (number.get(i).equals(input)) {
				System.out.println(input+"は数値の"+i+"です");
				return;
			}
		}
		System.out.println(input + "は英単語として存在しません");
	}
}
