public abstract class Shape {

	public abstract int getTotalArea();

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(5,4);
		System.out.println(rect.getTotalArea());
	}

}

class Rectangle extends Shape {

	private int width;
	private int length;

	// constructor
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	public int getTotalArea() {
		return width * length;

	}

}
