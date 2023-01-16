package week.problem4;

public class Problem4_3 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*10)+1;
		System.out.println("数：" + n);
		int i = 1;
		do {
			System.out.print("■");
			i++;
		} while (i<=n);
		System.out.println("");
	}
}
