
public class SwitchStatementStrings {
	
	//main
	public static void main(String[]args){
		
		//calling method
		visitCountry("Eire");
		visitCountry("Scotland");
		visitCountry("Spain");
		
	}
	
	// vistCountry method using a switch statement
	public static void visitCountry(String country) {
	
		switch(country) {
		case "Eire":
			System.out.println("Welcome to Ireland");
			break;
		case "Scotland":
			System.out.println("Welcome to Scotland");
			break;
		default:
			System.out.println("Country not found");
			break;
		}
	}
}