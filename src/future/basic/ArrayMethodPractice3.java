package future.basic;

public class ArrayMethodPractice3 {
	public static void main(String[] args) {
		int[] arr = {13, 90, 10, 79, 101, 25, 123, 38, 5, 16, 64, 55, 17};
		int[] arr2 = {38, 118, 26, 17, 41, 53, 10, 88, 92, 102, 67, 22, 55};
		// commonメソッドの呼び出し
		System.out.println("共通する数値の個数：" + common(arr, arr2));
	}
	// ここにcommonメソッドを定義してください。
	public static int common(int[] arr1,int[] arr2) {
		int count = 0;
		for (int i : arr1) {
			for (int j : arr2) {
				if(i==j) {
					count++;
				}
			}
		}
		return count;
	}
}
