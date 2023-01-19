package week.exproblem3;

public class FighterAiracraft extends AirPlane {
	public FighterAiracraft() {
		super("戦闘機");
	}
	//  飛行する
	public void fly(){
		System.out.println("攻撃に出るために飛行します。");
	}
	//  戦闘する
	public void fight(){
		System.out.println("戦闘します。");
	}
}