package future.object_oriented1;

public class Car {
	private String type;
	private int number;
	private double gasolin;
	public Car(String type,int number,double gasolin) {
		this.type = type;
		this.number = number;
		this.gasolin = gasolin;
	}
	public Car(String type,int number) {
		this(type,number,5.0);
	}
	public void run(double gasolin) {
		if(this.gasolin<gasolin) {
			System.out.println("ナンバー"+number+"の"+type+"はガソリン不足のため走行できません");
		}else {
			System.out.println("ナンバー"+number+"の"+type+"はガソリン"+gasolin+"リットル分走行しました");
			this.gasolin -= gasolin;
		}
	}
	public void showInfo() {
		System.out.println("車種："+type+" ナンバー："+number+" ガソリン："+gasolin+"リットル");
	}
}
