package java_practice;

public class Chapter8 {
	public static void main(String[] args) {
		System.out.println("練習問題8-1");
		Cat cat1 = new Cat();
		cat1.Name = "ミケ";
		cat1.Age = 3;
		cat1.ShowProfile();
		cat1.Sleep();
		
		System.out.println("練習問題8-2");
		Cat cat2 = new Cat();
		Dog8 dog2 = new Dog8();
		cat2.Name = "タマ";
		cat2.Age = 2;
		dog2.Name = "ポチ";
		dog2.Age = 4;
		cat2.ShowProfile();
		dog2.ShowProfile();
		cat2.Sleep();
		dog2.Run();
		
		System.out.println("練習問題8-3");
		Cat cat3 = new Cat();
		Dog8 dog3 = new Dog8();
		cat3.Name = "ミャーコ";
		cat3.Age = 5;
		dog3.Name = "ドグ";
		dog3.Age = 8;
		cat3.ShowProfile();
		dog3.ShowProfile();
		cat3.Speak();
		dog3.Speak();
		
		System.out.println("練習問題8-4");
		Animal[] animals = new Animal[4];
		animals[0] = new Cat();
		animals[1] = new Dog8();
		animals[2] = new Cat();
		animals[3] = new Dog8();
		for (Animal animal : animals) {
			animal.Speak();
		}
	}
}
