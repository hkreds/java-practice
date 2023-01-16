package week.problem3;

public class Problem3_11 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*100)+1;
		System.out.println(n);
		if(n>=20&&n<80) {
			System.out.println("20以上80未満です");
		}else {
			System.out.println("20未満か、80以上です");
		}
	}
}
