package week.exproblem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem6_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> animals = new HashMap<String, String>();
		animals.put("cat", "猫");
		animals.put("dog", "犬");
		animals.put("bird", "鳥");
		animals.put("tiger", "虎");
		System.out.print("英語で動物の名前を入力してください：");
		String animal = br.readLine();
		if(animals.get(animal)==null) {
			System.out.println("対応するデータは登録されていません。");
		}else {
			System.out.println("「" + animals.get(animal) + "」です。");
		}
	}
}
