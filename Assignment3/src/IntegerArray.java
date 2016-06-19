
public class IntegerArray {
	
	public static void main(String [] args){
		
		//declare array of type int
		int[] myArray;
		
		//initialise array - allocates memory for 5 integers
		myArray = new int[5];
		
		//assign values
		myArray[0] = 100;
		myArray[1] = 20;
		myArray[2] = 3;
		myArray[3] = 40;
		myArray[4] = 500;
		
		 //for loop
        for (int i=0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
 
	}

}
