package week.exproblem5;

import java.util.ArrayList;
import java.util.Collections;

public class Problem5_7 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int i = 1;
		while(i!=0) {
			i = (int)(Math.random()*11);
			System.out.println("0～10の値を出力:"+i);
			if(i!=0) {
				nums.add(i);
				System.out.print("出力された数：");
				Collections.sort(nums);
				for (Integer num : nums) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
		}
	}
}