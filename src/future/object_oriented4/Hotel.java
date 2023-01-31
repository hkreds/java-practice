package future.object_oriented4;

import java.util.ArrayList;

//ここにホテルクラスを作成してください
class Hotel {
	private String name;
	private long profits;
	private ArrayList<Staff> staffs;
	private ArrayList<Customer> customers;
	enum RoomRank {
		SUITE("スイートルーム",100000),
		NORMAL("通常ルーム",20000),
		ECONOMY("格安ルーム",5000);
		private String roomRankName;
		private int price;
		RoomRank(final String roomRankName,final int price) {
			this.roomRankName = roomRankName;
			this.price = price;
		}
		public int getPrice() {
			return price;
		}
		@Override
		public String toString() {
			return roomRankName;
		}
	}
	public Hotel(final String name) {
		this.name = name;
		System.out.println(name+"がオープンしました");
		staffs = new ArrayList<Staff>();
		customers = new ArrayList<Customer>();
	}
	public void enter(final Staff staff) {
		System.out.println(staff.name+"が"+name+"に出勤しました");
		staffs.add(staff);
	}
	public void enter(final Customer customer,final RoomRank rank) {
		try {
			profits += customer.pay(rank.getPrice());
			System.out.println(customer.name+"が"+name+"の"+rank+"にお泊まりになります");
			customers.add(customer);
		} catch (ShortFallException e) {
			System.out.println(e.getMessage());
		}
	}
	public void manage() {
		for (Staff staff : staffs) {
			staff.work();
		}
	}
	public void showCustomerInfo() {
		System.out.println("お客様情報");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	public void showHotelInfo() {
		System.out.println(name+"の現在の状況");
		System.out.println("現在働いている従業員数："+staffs.size()+"名");
		System.out.println("現在お泊まりのお客様数："+customers.size()+"名");
		System.out.println("現在の利益："+profits+"円");
	}
}
//人抽象クラス
abstract class Person {
 // 氏名
 protected String name;
 // 名前取得メソッド
 public String getName() {
     return name;
 }
}
//労働可能インタフェース
interface Workable {
 // 働く抽象メソッド
 void work();
}
//ここに従業員クラスを作成してください
class Staff extends Person implements Workable {
	private String jobType;
	public Staff(final String name,final String jobType) {
		this.name = name;
		this.jobType = jobType;
	}
	public void work() {
		System.out.println(name+"が"+jobType+"を行いました");
	}
}
//ここに顧客クラスを作成してください
class Customer extends Person {
	private int money;
	public Customer(final String name,final int money) {
		this.name = name;
		this.money = money;
	}
	public int pay(final int money) throws ShortFallException {
		if (this.money<money) {
			throw new ShortFallException(name+"は所持金不足です");
		}else {
			this.money -= money;
			return money;
		}
	}
	@Override
	public String toString() {
		return name + "様　所持金：" + money + "円";
	}
}
//所持金不足例外クラス
class ShortFallException extends Exception {
	public ShortFallException(String message) {
		super(message);
	}
}
