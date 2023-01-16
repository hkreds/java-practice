package week.problem4;

public class Problem4_8 {
	public static void main(String[] args) {
		int i = 0; 
		while (i != 10) {
			i = (int) (Math.random()*10)+1;
			System.out.println(i);
		}
		System.out.println("終了します");
	}
}
