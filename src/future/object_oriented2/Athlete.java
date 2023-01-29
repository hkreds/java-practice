package future.object_oriented2;

abstract class Athlete {
	//選手名
	protected String name;
	// 種目名取得メソッド（抽象メソッド）
	public abstract String getType();
	@Override
	public String toString() {
		return "私の名前は" + name + "、" + getType() + "の選手です。";
	}
}
class Swimmer extends Athlete{
	public static final String TYPE = "水泳";
	public Swimmer(String name) {
		this.name = name;
	}
	public String getType() {
		return TYPE;
	}
	public void swim() {
		System.out.println(name+"は泳ぎました。");
	}
}
class MarathonRunner extends Athlete{
	public static final String TYPE = "マラソン";
	public MarathonRunner(String name) {
		this.name = name;
	}
	public String getType() {
		return TYPE;
	}
	public void run() {
		System.out.println(name+"は走りました。");
	}
}