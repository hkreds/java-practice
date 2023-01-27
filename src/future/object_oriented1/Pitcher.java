package future.object_oriented1;

public class Pitcher extends BaseballPlayer {
	private double era;
	public Pitcher(String name,int uniformNumber,double battingAverage,double era) {
		this.name = name;
		this.uniformNumber = uniformNumber;
		this.battingAverage = battingAverage;
		this.era = era;
	}
	public void introduce() {
		System.out.println("選手名："+name);
		System.out.println("背番号："+uniformNumber);
		System.out.println("打率  ："+battingAverage);
		System.out.println("防御率："+era);
	}
}
