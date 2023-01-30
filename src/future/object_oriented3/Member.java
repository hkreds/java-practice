package future.object_oriented3;

class Member {
	private int id;        // ID
	private String name;         // 名前
	// コンストラクタ
	public Member(final int id, final String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ID:" + id + " NAME:" + name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if(!(obj instanceof Member)) {
			return false;
		}
		return this.id == ((Member)obj).id;
	}
	@Override
	public int hashCode() {
		return id;
	}
}
