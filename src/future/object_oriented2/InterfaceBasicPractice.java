package future.object_oriented2;

public class InterfaceBasicPractice {
	public static void main(String[] args) {
		// 鳥配列オブジェクトの生成
		Bird14[] birds = {new Swallow(), new Penguin(), new Atthis()};
		// 鳥たちの紹介
		// ここからコーディングしてください
		for (Bird14 bird : birds) {
			bird.eat();
			if (bird instanceof Flyable) {
				((Flyable) bird).fly();
			}
			if (bird instanceof Swimable) {
				((Swimable) bird).swim();
			}
			System.out.println();
		}
	}
}
//飛行可能インタフェース
interface Flyable {
	// 飛ぶ抽象メソッド
	void fly();
}
//水泳可能インタフェース
interface Swimable {
	// 泳ぐ抽象メソッド
	void swim();
}
//食事可能インタフェース
interface Eatable {
	// 食べる抽象メソッド
	void eat();
}
//鳥抽象クラス
abstract class Bird14 implements Eatable {}
//ここにつばめクラスを作成してください
class Swallow extends Bird14 implements Flyable {
	public void eat() {
		System.out.println("つばめが虫を食べました。");
	}
	public void fly() {
		System.out.println("つばめがスイスイ飛んでいます。");
	}
}
//ここにペンギンクラスを作成してください
class Penguin extends Bird14 implements Swimable {
	public void eat() {
		System.out.println("ペンギンが魚を食べました。");
	}
	public void swim() {
		System.out.println("ペンギンがスイスイ泳いでいます。");
	}
}
//ここにカワセミクラスを作成してください
class Atthis extends Bird14 implements Flyable, Swimable {
	public void eat() {
		System.out.println("カワセミが小魚を食べました。");
	}
	public void fly() {
		System.out.println("カワセミがスイスイ飛んでいます。");
	}
	public void swim() {
		System.out.println("カワセミがスイスイ泳いでいます。");
	}
}