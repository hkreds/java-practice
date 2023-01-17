package week.problem8;

public class Problem8_8 {
	public static void main(String[] args) {
		int n = (int) (Math.random()*1000)+1;
		System.out.print(n+"の約数：");
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
