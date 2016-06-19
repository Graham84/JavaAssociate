import java.util.Scanner;


public class Calc {  
	
	//main method begin execution of Java Application
	public static void main (String[] args) {
		//create a Scanner to obtain input from keyboard
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int number1;	//first number to add
		int number2;	//second number to add
		int total;		//sum of number1 & number2
		
		System.out.println("Welcome to myCalculator");
		System.out.println("Please enter first number");	//prompt
		number1 = input.nextInt();							//read first number from keyboard
		
		System.out.println("Please enter second number");	//prompt
		number2 = input.nextInt();							//read second number from keyboard
	
		total = number1 + number2;							//add numbers, then store in total
		
		System.out.println("Addition Total is " + total);	//display total;
	}														// end method main
}															// end class

