package week.problem3;

public class Problem3_16 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*100)+1;
		System.out.println(n);
		if (n%2==0&&n%3==0) {
			System.out.println("2と3の公倍数です。");
		}else if (n%2==0) {
			System.out.println("2の倍数です。");
		}else if (n%3==0) {
			System.out.println("3の倍数です。");
		}
	}
}
