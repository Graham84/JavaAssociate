import java.util.Scanner;


public class Trout {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Salmon mySalmon = new Salmon();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		mySalmon.simpleMessage(name);
	}

}
