package future.object_oriented2;

public abstract class Animal {
	public abstract void sing();
}
class Dog extends Animal{
	public void sing() {
		System.out.println("わんわん");
	}
}
class Cat extends Animal{
	public void sing() {
		System.out.println("にゃーにゃー");
	}
}
class Bird extends Animal{
	public void sing() {
		System.out.println("ぴよぴよ");
	}
}