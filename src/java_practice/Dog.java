package java_practice;

public class Dog	{
  //練習問題7-1
  private String Name;
  public void SetName(String nm) {
    Name = nm;
  }
  public void ShowProfile() {
    System.out.println(Kind + "で名前は、" + Name + "、年齢は、" + Age + "歳です。");
  }
  //練習問題7-2
  private int Age;
  public void SetAge(int age) {
    Age = age;
  }
  //練習問題7-4
  private String Kind;
  public Dog(String kd) {
  	Kind = kd;
  }
}