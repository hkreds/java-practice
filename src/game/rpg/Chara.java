package game.rpg;

public class Chara {
	private int HP,ATK,DEF;
	private String name;
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK) {
		ATK = aTK;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int dEF) {
		DEF = dEF;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void status() {
		System.out.print(getName()+"のステータス");
		System.out.println("(体力："+getHP()+"　攻撃："+getATK()+"　防御："+getDEF()+")");
	}
}
