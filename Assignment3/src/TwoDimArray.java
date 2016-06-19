public class TwoDimArray {

	public static void main(String[] args) {

		// two dimensional string array
		int country = 2;
		int colour = 2;

		String[][] myArray = new String[country][colour];

		// assign values
		myArray[0][0] = "Ireland";
		myArray[0][1] = "Green";

		myArray[1][0] = "Sweden";
		myArray[1][1] = "Blue";

		// revised submission 27/09/15 using .length annotation
		// output values using for loop
		for (int c = 0; c < myArray.length; c++) {
			for (int j = 0; j < myArray[c].length; j++) {
				System.out.print(myArray[c][j] + "\t");
				/* System.out.println(myArray[c][j]); */

			}
		}

		// old submission
		// output values using for loop
		/*
		 * for(int i = 0; i < country; i++){ for(int j = 0; j < colour; j++){
		 * System.out.println(myArray[i][j]);
		 */

	} // end main

} // end class
