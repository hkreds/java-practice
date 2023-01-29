package future.object_oriented2;

public class InheritanceInterfacePractice {
	public static void main(String[] args) {
		// ミュージシャン配列の作成
		Musician[] band = {
				new Vocalist("桜井"),
				new Guitarist("田原", "リードギター"),
				new Guitarist("中川", "ベース"),
				new ChorusDrummer("鈴木")
		};
		// ミュージックスタート！
		for (Musician musician : band) {
			if (musician instanceof Singable) {
				((Singable) musician).sing();
			}
			if (musician instanceof Playable) {
				((Playable) musician).play();
			}
		}
	}
}
