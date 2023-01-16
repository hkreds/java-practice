package week.problem5;

public class Problem5_1 {
	public static void main(String[] args) {
		int[] a = new int[7];
		for (int i=0;i<7;i++) {
			int rand = (int) (Math.random()*10)+1;
			a[i] = rand;
		}
		for(int i=0;i<7;i++) {
			System.out.print("a[" + i + "]=" + a[i] + " ");
		}
	}
}
