package week.problem8;

public class Problem8_5 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%3==0||(i>=30&&i<=39)||(i-3)%10==0) {
				System.out.println(i);
			}
		}
	}
}
