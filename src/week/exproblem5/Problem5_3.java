package week.exproblem5;

import java.util.ArrayList;

public class Problem5_3 {
	public static void main(String[] args) {
		ArrayList<Integer> nums0 = new ArrayList<Integer>();
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		ArrayList<Integer> nums3 = new ArrayList<Integer>();
		ArrayList<Integer> nums4 = new ArrayList<Integer>();
		ArrayList<Integer> nums5 = new ArrayList<Integer>();
		ArrayList<Integer> nums6 = new ArrayList<Integer>();
		ArrayList<Integer> nums7 = new ArrayList<Integer>();
		ArrayList<Integer> nums8 = new ArrayList<Integer>();
		ArrayList<Integer> nums9 = new ArrayList<Integer>();
		int i = 1;
		while(i!=0) {
			i = (int)(Math.random()*101);
			System.out.println("0～100の値を出力:"+i);
			if(i%10==0&&i!=0) {
				nums0.add(i);
			}else if (i%10==1) {
				nums1.add(i);
			}else if (i%10==2) {
				nums2.add(i);
			}else if (i%10==3) {
				nums3.add(i);
			}else if (i%10==4) {
				nums4.add(i);
			}else if (i%10==5) {
				nums5.add(i);
			}else if (i%10==6) {
				nums6.add(i);
			}else if (i%10==7) {
				nums7.add(i);
			}else if (i%10==8) {
				nums8.add(i);
			}else if (i%10==9) {
				nums9.add(i);
			}
		}
		System.out.print("一の位が0：");
		if(nums0.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums0) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が1：");
		if(nums1.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums1) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が2：");
		if(nums2.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums2) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が3：");
		if(nums3.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums3) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が4：");
		if(nums4.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums4) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が5：");
		if(nums5.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums5) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が6：");
		if(nums6.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums6) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が7：");
		if(nums7.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums7) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が8：");
		if(nums8.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums8) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.print("一の位が9：");
		if(nums9.size()==0) {
			System.out.print("なし");
		}
		for (Integer n : nums9) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}