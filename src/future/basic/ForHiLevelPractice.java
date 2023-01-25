package future.basic;

public class ForHiLevelPractice {
	public static void main(String[] args) {
		// 山の段数を表す変数
		int level = 5;
		// for文の開始
		for(int i=1;i<=level;i++) {
			for(int j=level-1;j>i-1;j--) {
				System.out.print("□");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
	}
}
