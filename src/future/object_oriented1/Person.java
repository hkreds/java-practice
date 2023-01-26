package future.object_oriented1;

public class Person {
	private String name;
	private int age;
	public void setData(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void introduce() {
		System.out.println("わたしの名前は"+name+"、年齢は"+age+"歳です。");
	}
	public void compare(Person person) {
		if(this.age==person.age) {
			System.out.println("わたくし"+this.name+"は、"+person.name+"さんと同じ年齢です。");
		}else if (this.age>person.age) {
			System.out.println("わたくし"+this.name+"は、"+person.name+"さんより"+(this.age-person.age)+"歳年上です。");
		}else if (this.age<person.age) {
			System.out.println("わたくし"+this.name+"は、"+person.name+"さんより"+(person.age-this.age)+"歳年下です。");
		}
	}
}
