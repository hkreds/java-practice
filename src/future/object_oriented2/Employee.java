package future.object_oriented2;

import java.util.Random;

class TroubleException extends Exception{}

public abstract class Employee {
	//社員名
	protected String name;
	// 働く抽象メソッド
	public abstract void work(String workName) throws TroubleException;
}
//ここに上司クラスを作成してください
class Boss extends Employee {
	private Subordinate sub;
	public Boss(String name,Subordinate sub) {
		this.name = name;
		this.sub = sub;
	}
	public void work(String workName) {
		System.out.println("さて、今回の"+workName+"は部下の"+sub.getName()+"にまかせよう！");
		System.out.println();
		try {
			sub.work(workName);
			System.out.println(sub.getName()+"君、よくやった！");
			System.out.println("さすが私の右腕だ！");
		} catch (TroubleException e) {
			System.out.println("申し訳ございません・・・");
			System.out.println(sub.getName()+"が大変失礼いたしました・・・");
			System.out.println("上司のわたくし"+name+"の監督不行き届きでございます・・・");
		}
	}
	
}
//ここに部下クラスを作成してください
class Subordinate extends Employee {
	public Subordinate(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void work(String workName) throws TroubleException {
		System.out.println("今回の"+workName+"はわたくし"+name+"が担当いたします");
		System.out.println(workName+"中・・・");
		Random r = new Random();
		if(r.nextBoolean()) {
			System.out.println("ふざけるな、ばか野郎！");
			System.out.println();
			throw new TroubleException();
		}else {
			System.out.println("今回の"+workName+"はわたくし"+name+"が無事任務を果たしました");
			System.out.println();
		}
	}
}
