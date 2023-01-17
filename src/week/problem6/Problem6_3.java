package week.problem6;

public class Problem6_3 {
	public static void main(String[] args) {
		Circle c = new Circle();
    c.r = 4.0;
    System.out.println("半径" + c.r +"の円の円周の長さは" + c.circumference());
    System.out.println("半径" + c.r +"の円の面積の長さは" + c.area());
	}
}
