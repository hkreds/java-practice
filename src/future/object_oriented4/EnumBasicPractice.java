package future.object_oriented4;

public class EnumBasicPractice {
	public static void main(String[] args) {
		// 四季列挙子を格納した配列変数の宣言
		Season[] seasons = {
				Season.SPRING,
				Season.SUMMER,
				Season.FALL,
				Season.WINTER
		};
		// 四季をループで回す
		for (Season season : seasons) {
			switch(season) {
			case SPRING:
			case FALL:
				System.out.println(season);
				break;
			case SUMMER:
				System.out.println(season+"は暑い！！");
				break;
			case WINTER:
				System.out.println(season+"は寒い！！");
				break;
			default:
				// 現状はありえない
				throw new RuntimeException("Illegal Season!");
			}
		}
	}
}
//ここに季節列挙型を作成してください
enum Season {
	SPRING("春"),	SUMMER("夏"),	FALL("秋"),	WINTER("冬");
	private String name;
	private Season(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
