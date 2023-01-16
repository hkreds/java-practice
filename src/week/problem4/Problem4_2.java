package week.problem4;

public class Problem4_2 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*10)+1;
		System.out.println("数：" + n);
		int i = 1;
		while (i<=n) {
			System.out.print("■");
			i++;
		}
		System.out.println("");
	}
}
