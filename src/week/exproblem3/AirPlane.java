package week.exproblem3;

public abstract class AirPlane {
	//飛行機のタイプ
	private String type;
	AirPlane(String type) {
		this.type = type;
	}
	//  タイプの取得
	public String getType(){
		return this.type;
	}
	abstract void fly();
}
