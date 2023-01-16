package week.problem5;

public class Problem5_5 {
	public static void main(String[] args) {
		int[] data = new int[10];
		for (int i=0;i<10;i++) {
			int rand = (int) (Math.random()*10)+1;
			data[i] = rand;
		}
		for(int i=0;i<10;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		int[] multiple3 = new int[10];
		int[] else_number = new int[10];
		int multiple3_count = 0;
		int else_number_count = 0;
		for(int i=0;i<10;i++) {
			if (data[i]%3==0) {
				multiple3[multiple3_count] = data[i];
				multiple3_count += 1;
			}else {
				else_number[else_number_count] = data[i];
				else_number_count += 1;
			}
		}
		System.out.print("3の倍数：");
		for (int i=0;i<multiple3.length; i++) {
			if(multiple3[i]!=0) {
				System.out.print(multiple3[i] + " ");
			}
		}
		System.out.println();
		System.out.print("3の倍数以外の数：");
		for (int i = 0; i < else_number.length; i++) {
			if(else_number[i]!=0) {
				System.out.print(else_number[i] + " ");
			}
		}
	}
}
