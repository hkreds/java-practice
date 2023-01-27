package future.object_oriented1;

public class Robot {
	private int id;
	private String name;
	private static int total;
	public Robot(String name) {
		this.name = name;
		total++;
		this.id = total;
	}
	public static int getTotal() {
		return total;
	}
	public void introduce() {
		System.out.println("ID："+id+" NAME："+name);
	}
}
