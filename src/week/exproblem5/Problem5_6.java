package week.exproblem5;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem5_6 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int i = 1;
		while(i!=0) {
			i = (int)(Math.random()*11);
			if(i!=0) {
				nums.add(i);
			}
			System.out.println("0～10の値を出力:"+i);
		}
		nums.removeAll(Arrays.asList(2));
		for (Integer num : nums) {
			System.out.print(num+" ");
		}
	}
}