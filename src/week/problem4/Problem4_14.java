package week.problem4;

public class Problem4_14 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*10)+1;
		if(n%2==0) {
			for(int i=1;i<=n;i++) {
				System.out.print("★");
			}
		}else {
			for(int i=1;i<=n;i++) {
				System.out.print("☆");
			}
		}
	}
}
