package future.basic;

public class ForBasicPractice {
	public static void main(String[] args) {
		// for文の開始
		for(int i=21;i<=29;i++) {
			for(int j=3;j<=9;j++) {
				if(i%j==0) {
					System.out.println(i+"は"+j+"の倍数です");
				}
			}
		}
	}
}
