public interface Gadget {
	void doStuff();
}

abstract class Electronic {
	void getPower() {
		System.out.print("plug in ");
	}
}
