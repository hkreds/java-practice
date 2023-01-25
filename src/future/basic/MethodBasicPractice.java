package future.basic;

public class MethodBasicPractice {
	public static void main(String[] args) {
		// displayメソッドの呼び出し
    display("テスト", 5);
	}
	public static void display(String message,int count) {
		for(int i=1;i<=count;i++) {
			System.out.println(message);
		}
	}
}
