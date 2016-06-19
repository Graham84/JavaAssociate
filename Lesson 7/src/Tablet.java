public class Tablet extends Electronic implements Gadget {
	void doStuff() {
		System.out.print("show book ");
	}

	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}