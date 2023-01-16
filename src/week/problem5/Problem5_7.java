package week.problem5;

public class Problem5_7 {
	public static void main(String[] args) {
		int[] data = new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
			sum += data[i];
		}
		System.out.println();
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + sum/5);
		int[] more_ave = new int[5];
		int[] less_ave = new int[5];
		int more_ave_count = 0;
		int less_ave_count = 0;
		for(int i=0;i<5;i++) {
			if(data[i]>sum/5) {
				more_ave[more_ave_count] = data[i];
				more_ave_count += 1;
			}else if (data[i]<sum/5) {
				less_ave[less_ave_count] = data[i];
				less_ave_count += 1;
			}
		}
		System.out.print("平均値より大きい数：");
		for(int i=0;i<5;i++) {
			if(more_ave[i]!=0) {
				System.out.print(more_ave[i] + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい数：");
		for(int i=0;i<5;i++) {
			if(less_ave[i]!=0) {
				System.out.print(less_ave[i] + " ");
			}
		}
		System.out.println();
	}
}
