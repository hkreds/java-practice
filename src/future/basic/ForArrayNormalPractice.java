package future.basic;

public class ForArrayNormalPractice {
	public static void main(String[] args) {
		// 100人分のテストの点数を格納した配列変数points
		int[] points = {69, 40, 88, 68, 13, 62, 45, 43, 28, 69,
										54, 77, 81, 34, 41, 78, 59, 21, 45, 64,
										55, 18, 63, 80, 64, 26, 52, 44, 61, 50,
										44, 82, 56, 74, 67, 98, 58, 84, 77, 70,
										60, 77, 64, 89, 59, 74, 21, 66, 85, 68,
										90, 48, 64, 80, 63, 47, 70, 79, 51, 66,
										23, 84, 57, 57, 76, 60, 100, 66, 79, 61,
										47, 66, 76, 45, 90, 69, 72, 51, 86, 64,
										57, 51, 42, 60, 71, 69, 7, 62, 77, 61,
										43, 50, 68, 30, 78, 58, 40, 62, 70, 22};
		// ここからコーディングしてください
		double sum = 0;
		int[] hist_arr = new int[10];
		for(int i=0;i<points.length;i++) {
			sum += points[i];
			if(points[i] == 100) {
				hist_arr[9]++;
			} else {
				hist_arr[points[i] / 10]++;
			}
		}
		double ave = sum / 100;
		System.out.println("平均点："+ave);
		System.out.println("ヒストグラム");
		for (int i=0;i<hist_arr.length;i++) {
			if(i==0) {
				System.out.print(" "+i+"点台 ");
				for(int j=1;j<=hist_arr[i];j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				System.out.print(i+"0点台 ");
				for(int j=1;j<=hist_arr[i];j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
