package week.problem4;

public class Problem4_13 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*10)+1;
		if(n>=5) {
			for(int i=1;i<=n;i++) {
				System.out.print("★");
			}
			System.out.println("");
		}else {
			System.out.println("発生した数値：" + n);
		}
	}
}
