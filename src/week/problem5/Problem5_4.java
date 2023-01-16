package week.problem5;

public class Problem5_4 {
	public static void main(String[] args) {
		int[] data = new int[10];
		for (int i=0;i<10;i++) {
			int rand = (int) (Math.random()*100)+1;
			data[i] = rand;
		}
		for(int i=0;i<10;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int[] upper50 = new int[10];
		int[] under50 = new int[10];
		int upper50_count = 0;
		int under50_count = 0;
		for(int i=0;i<10;i++) {
			if (data[i]<50) {
				under50[under50_count] = data[i];
				under50_count += 1;
			}else {
				upper50[upper50_count] = data[i];
				upper50_count += 1;
			}
		}
		System.out.print("50以上の数：");
		for (int i=0;i<upper50.length; i++) {
			if(upper50[i]!=0) {
				System.out.print(upper50[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数：");
		for (int i = 0; i < under50.length; i++) {
			if(under50[i]!=0) {
				System.out.print(under50[i] + " ");
			}
		}
	}
}
