
public class StringPool {
	
	
	public static void main(String[]args){
		method1();
		method2();
		method3();
	}
	
	 public static void method1(){
		String mystring1 = "Hello World";						//Creates an entry in the String Pool. mystring1 has a unique memory location
		String mystring2 = new String("Hello World");			//Creates a new String object. mystring2 is a new String therefore has a unique memory location
		if (mystring1 == mystring2)								//fundamental operator == checks if the arguments memory location are the same. ie the exact same instance
		{
		System.out.println("M1 The 2 strings are equal");		//different memory locations so will NOT be printed to screen
		}														
		else
		{
		System.out.println("M1 The 2 strings are not equal");	//This statement is correct
		}
		}
		public static void method2(){
		String mystring1 = "Hello World";						//Creates an entry in the String Pool.local variable declared within a method mystring1 has a unique memory location
		String mystring2 = new String("Hello World");			//Creates a new String object. mystring2 is a new String therefore has a unique memory location
		if (mystring1.equals(mystring2))						//equals() is an instance method which is fundamentally defined by the java.lang.Object class.
		{														//The method, .equals() tests to see if the two objects being compared to each other are equivalent , but they need not be the exact same instance of the same object.
		System.out.println("M2 The 2 strings are equal");		//"Hello World" = "Hello World" this statement is correct and will be output
		}
		else
		{
		System.out.println("M2 The 2 strings are not equal");	//incorrect the 2 strings are equal
		}
		}
		public static void method3(){
		String mystring1 = "Hello World";						//Creates an entry in the String Pool
		String mystring2 = "Hello World";						//Creates an entry in the String Pool
		if (mystring1 == mystring2)								//Both Strings are stored in String Pool and have the same memory location
		{
		System.out.println("M3 The 2 strings are equal");		//This is correct and will be printed to screen
		}
		else
		{
		System.out.println("M3 The 2 strings are not equal");	//incorrect both strings are in the same location therefore == is true.
		}
		}

}