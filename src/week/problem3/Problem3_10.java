package week.problem3;

public class Problem3_10 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*100)+1;
		System.out.println(n);
		if(n<=10||n>=90) {
			System.out.println("10以下か90以上の値です");
		}else {
			System.out.println("10より大きく90未満です");
		}
	}
}
