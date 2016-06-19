import java.util.Scanner;


public class Calc {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		System.out.println(total);
		average = total/10;
		System.out.println("Your average is " + average);
	}

}
