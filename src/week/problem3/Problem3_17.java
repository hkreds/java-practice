package week.problem3;

public class Problem3_17 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*100)+1;
		System.out.println(n);
		if (n<=50&&n%2==0) {
			System.out.println("50以下の偶数です。");
		}else if (n<=50) {
			System.out.println("50以下です。");
		}else if (n%2==0) {
			System.out.println("偶数です。");
		}
	}
}
