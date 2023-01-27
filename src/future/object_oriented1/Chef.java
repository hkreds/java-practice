package future.object_oriented1;

public class Chef {
	public String cook(Egg egg,Cheese cheese) {
		return "スクランブルエッグ";
	}
	public String cook(Rice rice, Egg egg) {
		return "オムライス";
	}
	public String cook(Rice rice,Cheese cheese) {
		return "リゾット";
	}
	public String cook(Milk milk,Egg egg) {
		return "プディング";
	}
}
//各種食材クラス
class Egg{}
class Rice{}
class Milk{}
class Cheese{}
