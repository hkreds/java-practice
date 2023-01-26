package future.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringImportantPractice {
	//正しいパスワード定数
	private static final String PASSWORD = "XYZ";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("パスワードを入力してください");
		// 入力パスワード変数の宣言と初期化
		String inputPassword = br.readLine();
		// ここからパスワードの一致を調べてください
		if(inputPassword.equals(PASSWORD)){
			System.out.println("パスワードが一致しました");
		}else {
			System.out.println("パスワードが一致しません");
		}
	}
}
