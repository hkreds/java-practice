package week.problem4;

public class Problem4_9 {
	public static void main(String[] args) {
		int i = 1; 
		while (i % 10 != 0) {
			i = (int) (Math.random()*100)+1;
			System.out.println(i);
		}
		System.out.println("終了します");
	}
}
