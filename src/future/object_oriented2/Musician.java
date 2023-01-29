package future.object_oriented2;

public abstract class Musician {
	//名前フィールド
	private String name;
	// コンストラクタ
	public Musician(String name) {
		this.name = name;
	}
	// 名前取得メソッド
	public String getName() {
		return name;
	}
}
//歌唱可能インタフェース
interface Singable {
	void sing();
}
//演奏可能インタフェース
interface Playable {
	void play();
}
//ここにボーカリストクラスを作成してください
class Vocalist extends Musician implements Singable {
	public Vocalist(String name) {
		super(name);
	}
	public void sing() {
		System.out.println(getName()+"は熱唱しました！");
	}
}
//ここにギタリストクラスを作成してください
class Guitarist extends Musician implements Playable {
	private String guitarType;
	public Guitarist(String name,String guitarType) {
		super(name);
		this.guitarType = guitarType;
	}
	public void play() {
		System.out.println(getName()+"は"+guitarType+"を演奏しました！");
	}
}
//ここにコーラス＆ドラマークラスを作成してください
class ChorusDrummer extends Musician implements Singable, Playable {
	public ChorusDrummer(String name) {
		super(name);
	}
	public void sing() {
		System.out.println(getName()+"はコーラスでハモりました！");
	}
	public void play() {
		System.out.println(getName()+"はドラムを演奏しました！");
	}
}
