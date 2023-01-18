package week.exproblem1;

public class Problem1_3 {
	public static void main(String[] args) {
		int y = (int)(Math.random()*10)+1;
		int x = (int)(Math.random()*10)+1;
		System.out.print("たて：");
		System.out.println(y);
		System.out.print("よこ：");
		System.out.println(x);
		square(y,x);
	}
	static void square(int y,int x) {
		for(int i=1;i<=y;i++) {
			for(int j=1;j<=x;j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}
