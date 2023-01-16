package week.problem3;

public class Problem3_13 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*3)+1;
		if(n==1) {
			System.out.println("グー");
		}else if (n==2) {
			System.out.println("パー");
		}else if (n==3) {
			System.out.println("チョキ");
		}
	}
}
