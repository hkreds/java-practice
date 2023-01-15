package java_practice;

public class Practice7 {
	public static void main(String[] args) {
		System.out.println("練習問題7-1");
		Dog dog = new Dog("柴犬");
		dog.SetName("犬");
		dog.ShowProfile();
		
		System.out.println("練習問題7-2");
		dog.SetAge(3);
		dog.ShowProfile();
		
		System.out.println("練習問題7-3");
		Dog dog1 = new Dog("チワワ");
		Dog dog2 = new Dog("チワワ");
		dog1.SetName("タロー");
		dog1.SetAge(1);
		dog2.SetName("ジロー");
		dog2.SetAge(2);
		dog1.ShowProfile();
		dog2.ShowProfile();
		
		System.out.println("練習問題7-4");
		Dog dog3 = new Dog("秋田犬");
		dog3.SetName("サブロー");
		dog3.SetAge(4);
		dog3.ShowProfile();
	}
}
