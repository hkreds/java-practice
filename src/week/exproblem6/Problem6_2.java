package week.exproblem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem6_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> nums = new HashMap<String, String>();
		System.out.print("整数の値を入力してください:");
		String[] arr = br.readLine().split("");
		nums.put("1","一");
		nums.put("2","二");
		nums.put("3","三");
		nums.put("4","四");
		nums.put("5","五");
		nums.put("6","六");
		nums.put("7","七");
		nums.put("8","八");
		nums.put("9","九");
		nums.put("0","〇");
		int judge = 0;
		for (String a : arr) {
			if(a.matches("[^0-9]")) {
				judge = 1;
			}
		}
		if(judge==1||arr[0].matches("0")) {
			System.out.println("整数の値を入力してください。");
		}else {
			if(arr.length%3==0) {
				System.out.print("変換結果:");
				int count = 0;
				for (String a : arr) {
					System.out.print(nums.get(a));
					count += 1;
					if(count%3==0&&arr.length!=count) {
						System.out.print(",");
					}
				}
			}else if(arr.length%3==1) {
				System.out.print("変換結果:");
				int count = 2;
				for (String a : arr) {
					System.out.print(nums.get(a));
					count += 1;
					if(count%3==0&&arr.length!=count-2) {
						System.out.print(",");
					}
				}
			}else if(arr.length%3==2) {
				System.out.print("変換結果:");
				int count = 1;
				for (String a : arr) {
					System.out.print(nums.get(a));
					count += 1;
					if(count%3==0&&arr.length!=count-1) {
						System.out.print(",");
					}
				}
			}
		}
	}
}
