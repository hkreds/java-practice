package future.basic;

public class VariablePractice {
	public static void main(String[] args) {
		// みかんの価格を表現するint型の変数を宣言してください。
		// （変数名はおまかせします）
		int price;
		// みかんの価格変数に130を代入してください。
		price = 130;
		// みかんの個数を表現するint型の変数を宣言し、
		// 初期値として6を代入してください。（変数名はおまかせします）
		int amount = 6;
		// みかんの総価格を表現するint型の変数を宣言し、
		// 初期値に「みかん価格変数の値×みかん個数変数の値」の演算結果
		// を代入してください。（変数名はおまかせします）
		int total_price = price * amount;
		// みかん価格変数の値を出力してください。
		System.out.println("みかんの価格："+price+"円");
		// みかん個数変数の値を出力してください。
		System.out.println("みかんの個数："+amount+"個");
		// みかん総価格変数の値を出力してください。
		System.out.println("みかんの総価格："+total_price+"円");
	}
}
