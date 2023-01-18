package week.problem8;

public class Problem8_13 {
	public static void main(String[] args) {
		Integer[] nums = new Integer[10];
		for(int i=0;i<10;i++) {
			nums[i] = (int)(Math.random()*100)+1;
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int i=0;i<9;i++) {
			for(int j=9;j>i;j--) {
				if(nums[j-1] > nums[j]) {
					int tmp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
}
