package week.exproblem6;

import java.util.HashSet;

public class Problem6_3 {
	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		System.out.print("乱数：");
		for(int i=1;i<=10;i++) {
			int num = (int)(Math.random()*10)+1;
			System.out.print(num+" ");
			nums.add(num);
		}
		System.out.println();
		System.out.print("出現した数：");
		for (Integer num : nums) {
			System.out.print(num+" ");
		}
	}
}
