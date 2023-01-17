package week.problem8;

public class Problem8_11 {
	public static void main(String[] args) {
		int[] nums1 = {4,9,4,3,6,8,7,1,3,10};
		int[] nums2 = {7,3,10,7,5,9,4,9,9,1};
		System.out.print("配列1：");
		for(int i=0;i<10;i++) {
			System.out.print(nums1[i]+" ");
		}
		System.out.println();
		System.out.print("配列2：");
		for(int i=0;i<10;i++) {
			System.out.print(nums2[i]+" ");
		}
		System.out.println();
		System.out.print("共通の数：");
		for(int i=1;i<=10;i++) {
			int a = i;
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					if(i==nums1[j]&&nums1[j]==nums2[k]&&a==nums1[j]) {
						System.out.print(nums1[j] + " ");
						a = 0;
					}
				}
			}
		}
		System.out.println();
		System.out.print("どちらか入っている数：");
		for(int i=1;i<=10;i++) {
			int a = i;
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					if(i==nums1[j]&&a==nums1[j]) {
						System.out.print(nums1[j] + " ");
						a = 0;
					}else if (i==nums2[k]&&a==nums2[k]) {
						System.out.print(nums2[k] + " ");
						a = 0;
					}
				}
			}
		}
	}
}
