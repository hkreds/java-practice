package week.problem3;

public class Problem3_12 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*21)-10;
		System.out.println(n);
		if(n<0) {
			System.out.println("負の値です");
		}else {
			System.out.println("正の値です");
		}
	}
}