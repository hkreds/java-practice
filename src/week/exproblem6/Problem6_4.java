package week.exproblem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problem6_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> chars = new HashSet<String>();
		System.out.print("英単語を入力:");
		String[] strings = br.readLine().split("");
		for (String string : strings) {
			chars.add(string);
		}
		System.out.print("使用されているアルファベット :");
		for (String chara : chars) {
			System.out.print(chara+" ");
		}
	}
}
