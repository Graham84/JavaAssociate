
public class ShirtTest {
	
	public static void main(String[] args) {
		
		Shirt myShirt = new Shirt();
		Shirt yourShirt = new Shirt();
		
		myShirt.display();
		
		myShirt = yourShirt;
		
		myShirt.colorCode = 'R';
		yourShirt.colorCode = 'G';
		
		System.out.println("Shirt colour: " + myShirt.colorCode);
		System.out.println("Shirt colour: " + yourShirt.colorCode);
		
	}

}
