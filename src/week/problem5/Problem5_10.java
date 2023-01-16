package week.problem5;

public class Problem5_10 {
	public static void main(String[] args) {
		int[] data = new int[7];
		for (int i=0;i<7;i++) {
			data[i] = (int) (Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		for (int i : data) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
