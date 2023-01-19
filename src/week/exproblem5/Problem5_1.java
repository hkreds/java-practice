package week.exproblem5;

import java.util.ArrayList;

public class Problem5_1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int i = 1;
		while(i!=0) {
			i = (int)(Math.random()*11);
			nums.add(i);
			System.out.println("0～10の値を出力:"+i);
		}
		ArrayList<Integer> even = new ArrayList<Integer>();
		for (Integer num : nums) {
			if(num%2==0&&num!=0) {
				even.add(num);
			}
		}
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for (Integer num : nums) {
			if(num%2!=0) {
				odd.add(num);
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for (Integer ei : even) {
			System.out.print(ei+" ");
		}
		System.out.println();
		System.out.print("奇数：");
		for (Integer oi : odd) {
			System.out.print(oi+" ");
		}
	}
}