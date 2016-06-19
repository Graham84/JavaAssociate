
public class StringCat {
	
	public static void main(String[]args){
	
	String myString = "Hello";				//set String as Hello
	myString = myString.concat(" World");	//concat world to existing string 
	System.out.println(myString);			//print new string
	
	String greet = "  HOW  ".trim();
	String lc = greet + "DY".toLowerCase();
	System.out.println(lc);
	String lc1 = (greet + "DY").toLowerCase();
	System.out.println(lc1);
	
	StringBuilder mySB = new StringBuilder("Hello"); //new StringBuilder assigned to mySB instantiated populated with the string hello
	mySB.append(" World");							//apppend
	System.out.println(mySB);						//print
}
}
