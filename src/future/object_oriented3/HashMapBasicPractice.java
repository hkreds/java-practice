package future.object_oriented3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapBasicPractice {
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> todou = new HashMap<String, Integer>();
		System.out.println("人口の多い都道府県ベスト10を当ててください！");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		todou.put("東京都", 1);
		while(todou.size()>0) {
			String input = br.readLine();
			if(todou.containsKey(input)) {
				System.out.println("正解！");
				System.out.println(input+"は"+todou.get(input)+"位です");
				todou.remove(input);
			}else {
				System.out.println("残念・・・");
				System.out.println(input+"はランキングに入っていません・・・");
				System.out.println("ゲームオーバー");
				break;
			}
		}
		if(todou.size()==0) {
			System.out.println("おめでとうございます！");
			System.out.println("ベスト10をすべて答えました！");
		}
	}
}
