package week.problem4;

public class Problem4_12 {
	public static void main(String[] args) {
		int min = 100;
		for(int i=1;i<=5;i++) {
			int n = (int)(Math.random()*100)+1;
			System.out.println(n);
			if(min>n) {
				min = n;
			}
		}
		System.out.println("最小値：" + min);
	}
}
