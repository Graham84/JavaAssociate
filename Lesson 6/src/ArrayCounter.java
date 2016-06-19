import java.util.Random;


public class ArrayCounter {

	public static void main(String[] args) {
		Random rand = new Random();
		int frequency[] = new int[7];
		
		for(int roll=1;roll<1000;roll++){
			++frequency[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequecy");;
		
		for(int face=1;face<frequency.length;face++){
			System.out.println(face + "\t" + frequency[face]);
		}
	}

}
