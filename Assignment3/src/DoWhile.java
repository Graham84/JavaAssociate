
public class DoWhile {
	public static void main(String[] args) {
		int i =8;
		do
		{
			System.out.println("i is : " + i);
			i++;
		} while(i < 1);
	}
}

//Output: i is : 1
//variable i is set to 1
//the do block executes and prints the value of i.
//this is true for any int entered as a value for i

//The do/while loop executes once, and then continues to repeat while true.
//The do/while loop is a one-to-many iterative loop:
//The condition is at the bottom of the loop and is processed after the body.
//The body of the loop is therefore processed at least once.
//If you want the statement, or statements, in the body to be processed at least once,
//use a do/while loop instead of while or for loop.
//The do/while loop is used to iterate indefinitely through statements one or more times.
