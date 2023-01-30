package future.object_oriented4;

//ここに大富豪クラスを作成してください
class MultiMillionaire extends Thread {
	private CollectionBox cb;
	public MultiMillionaire(final CollectionBox cb) {
		this.cb = cb;
	}
	@Override
	public void run() {
		for(int i=0;i<1000000;i++) {
			cb.contribute(1);
		}
	}
}
//ここに募金箱クラスを作成してください
class CollectionBox {
	private int totalAmount;
	private static CollectionBox cb;
	private CollectionBox() {}
	public static CollectionBox getInstance() {
		if (cb==null) {
			cb = new CollectionBox();
		}
		return cb;
	}
	public synchronized void contribute(int money) {
		totalAmount += money;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
}