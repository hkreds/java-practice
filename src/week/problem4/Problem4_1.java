package week.problem4;

public class Problem4_1 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*10)+1;
		System.out.println("数：" + n);
		for(int i=1;i<=n;i++) {
			System.out.print("■");
		}
		System.out.println("");
	}
}
