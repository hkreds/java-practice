package future.object_oriented1;

public class Square {
	private double width;
	private double height;
	public Square(double width,double height) {
		this.width = width;
		this.height = height;
	}
	public void inform() {
		System.out.println("この四角形の幅は"+width+"、高さは"+height+"です。");
	}
	public double getArea() {
		return width * height;
	}
	public void addWidth(double addWidth) {
		width += addWidth;
	}
}
