package week.problem3;

public class Problem3_18 {
	public static void main(String[] args) {
		int temperature = (int)(Math.random()*46)-10;
		System.out.println("摂氏"+temperature+"度");
		if(temperature>=30) {
			System.out.println("真夏日です。");
		}else if (temperature>=25) {
			System.out.println("夏日です。");
		}else if (temperature<0) {
			System.out.println("真冬日です。");
		}
	}
}
