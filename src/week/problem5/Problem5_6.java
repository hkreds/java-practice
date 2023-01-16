package week.problem5;

public class Problem5_6 {
	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i=0;i<10;i++) {
			data[i] = (int) (Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int min=10,max=1,sum=0;
		for (int i = 0; i < data.length; i++) {
			if(data[i]<min) {
				min = data[i];
			}else if (data[i]>max) {
				max = data[i];
			}
			sum += data[i];
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("平均値：" + sum/10);
	}
}
