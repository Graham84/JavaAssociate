
public class Bools {

	public static void main(String[] args) {
		
		//declare two booleans
		boolean b1 = true;
		boolean b2 = false;
		//output values
		System.out.println("Boolean b1 = " + b1);
		System.out.println("Boolean b2 = " + b2);
		
		//third boolean reverse of b1
		boolean b3 = !b1 ;
		System.out.println("Boolean b3 = " + b3);
		//logical OR
		b3 = b1 || b2;
		System.out.println("Boolean b3 = " + b3);
		
		//fourth boolean set as a string
		String myString = "true";
		//String to boolean conversion
		boolean b4 = Boolean.parseBoolean(myString);
		System.out.println("Boolean b4 = " + b4);
		
		//logical AND
		boolean result = b3 && b4;
		System.out.println("Boolean result = " + result);

	}

}
