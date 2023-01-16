package week.problem4;

public class Problem4_11 {
	public static void main(String[] args) {
		int max = 1;
		for(int i=1;i<=5;i++) {
			int n = (int)(Math.random()*100)+1;
			System.out.println(n);
			if(max<n) {
				max = n;
			}
		}
		System.out.println("最大値：" + max);
	}
}
