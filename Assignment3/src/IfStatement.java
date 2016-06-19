import java.util.Scanner;


public class IfStatement {
	
	//main method begin execution of Java Application
	public static void main (String[] args) {
		//create a Scanner to obtain input from keyboard
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int number1;	//first number to add
		
		System.out.println("Welcome to myWeek");
		System.out.println("Please enter a number 1-7");	//prompt-
		number1 = input.nextInt();							//read first number from keyboard
		
		if (number1 == 1) {									//7 if statements for days of the week
		      System.out.println("Today is Monday");
		    }
		if (number1 == 2) {
		      System.out.println("Today is Tuesday");
		    }
		if (number1 == 3) {
		      System.out.println("Today is Wednesday");
		    }
		if (number1 == 4) {
		      System.out.println("Today is Thursday");
		    }			
		if (number1 == 5) {
		      System.out.println("Today is Friday");
		    }
		if (number1 == 6) {
		      System.out.println("Today is Saturday");
		    }
		if (number1 == 7) {
		      System.out.println("Today is Sunday");
		    }
		if (number1 > 7) {									//if statement for number out of range				
			System.out.println("Invalid. Please enter a number 1-7");
		}
	}														// end method main
}															// end class

