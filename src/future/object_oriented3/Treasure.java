package future.object_oriented3;

import java.util.HashMap;

//ここに宝物クラスを作成してください
class Treasure {
	private String type;
	public Treasure(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return type;
	}
}
//ここに秘密の言葉不正例外クラスを作成してください
class IllegalSecretException extends Exception {}
//ここに秘密の言葉重複例外クラスを作成してください
class DuplicateSecretException extends Exception {}
//ここに金庫クラスを作成してください
class StrongBox {
	private HashMap<String,Treasure> treasures;
	public StrongBox() {
		treasures = new HashMap<String, Treasure>();
	}
	public void store(String secret,Treasure treasure) throws DuplicateSecretException {
		if (treasures.containsKey(secret)) {
			throw new DuplicateSecretException();
		}else {
			System.out.println(treasure+"を金庫に格納しました！");
			treasures.put(secret, treasure);
		}
	}
	public Treasure getTreasure(String secret) throws IllegalSecretException {
		if (treasures.containsKey(secret)) {
			return treasures.get(secret);
		}else {
			throw new IllegalSecretException();
		}
	}
}
