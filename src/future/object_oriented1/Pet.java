package future.object_oriented1;

public class Pet {
	private String type;
	private String name;
	private byte age;
	private boolean gender;
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getIntroduction() {
		if(gender) {
			return type + "の" + name + "はメスで" + age + "歳です。";
		}else {
			return type + "の" + name + "はオスで" + age + "歳です。";
		}
	}
}