package future.basic;

public class IfNormalPractice {
	public static void main(String[] args) {
		// 年齢変数の宣言と初期化
		int age = 25;        // ←値を変更しながら実行
		System.out.println("年齢：" + age);
		// if文の開始
		if (age>20) {
			System.out.println("成人です");
		}else if (age<20&&age>=0) {
			System.out.println("未成年です");
			if (age<6||age>14) {
				System.out.println("今は義務教育を受けていません");
			}else {
				System.out.println("今は義務教育を受けています");
			}
		}else {
			System.out.println("エラー");
		}
	}
}
