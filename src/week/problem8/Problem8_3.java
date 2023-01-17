package week.problem8;

public class Problem8_3 {
	public static void main(String[] args) {
		int factorial = 1;
		int n = 6;
		for(int i=n;i>=1;i--) {
			factorial *= i;
		}
		System.out.println(n+"の階乗は、"+factorial);
	}
}
