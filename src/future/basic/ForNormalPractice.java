package future.basic;

public class ForNormalPractice {
	public static void main(String[] args) {
		// for文の開始
		outer:
		for(int i=10;i<=100;i++) {
			for(int j=2;j<=(i/2);j++) {
				if(i%j==0) {
					continue outer;
				}
			}
			System.out.println(i);
		}
	}
}
