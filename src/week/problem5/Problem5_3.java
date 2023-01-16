package week.problem5;

public class Problem5_3 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i=0;i<10;i++) {
			int rand = (int) (Math.random()*100)+1;
			a[i] = rand;
		}
		for(int i=0;i<10;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int[] kisuu = new int[10];
		int[] guusuu = new int[10];
		int kisuu_count = 0;
		int guusuu_count = 0;
		for(int i=0;i<10;i++) {
			if (a[i]%2==0) {
				guusuu[guusuu_count] = a[i];
				guusuu_count += 1;
			}else {
				kisuu[kisuu_count] = a[i];
				kisuu_count += 1;
			}
		}
		System.out.print("奇数：");
		for (int i=0;i<kisuu.length; i++) {
			if(kisuu[i]!=0) {
				System.out.print(kisuu[i] + " ");
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for (int i = 0; i < guusuu.length; i++) {
			if(guusuu[i]!=0) {
				System.out.print(guusuu[i] + " ");
			}
		}
	}
}
