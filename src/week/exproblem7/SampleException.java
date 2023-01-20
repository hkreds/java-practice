package week.exproblem7;

public class SampleException {
	public static void main(String[] args) {
		for(int i = 0; i < 3 ; i++){
			for(int j = 0; j < 3; j++){
				try {
					System.out.print(i + "/ " + j + " = " + i/j + " ");
				} catch (Exception e) {
					System.out.println("0で割り算はできません。");
				}
			}
			System.out.println();
		}
	}
}