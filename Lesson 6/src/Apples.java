
public class Apples {

	public static void main(String[] args) {
		
		int loop = 0;
		
		int ifelse = 15;
		
		boolean cond1 = 5 != 2;
		boolean cond2 = 5 == 7;
		
		int age;
		age = 1;
		
		int boy, girl;
		boy = 18;
		girl = 68;
		
		int test = 8;
		
		while(loop < 21) {
			System.out.println("Looping " + loop);
			
			
			loop++;
		}
		
		if(ifelse < 10) {
			System.out.println("Oui cest true");
		} else if(ifelse > 20) {
			System.out.println("Non cest false");
		} else {
			System.out.println("None of the above");
		}
		
		
		System.out.println(cond1);
		System.out.println(cond2);
		
		switch(age){
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
			break;
		}
		
		//and: both have to be true
		if (boy >= 18 && girl <= 60 ){
			System.out.println("You can enter");
		} else {
			System.out.println("You cannot enter");
		}
		
		//or: only 1 needs to be true or both
		if (boy >= 18 || girl <= 60 ){
			System.out.println("You can enter");
		} else {
			System.out.println("You cannot enter");
		}
		
		if (test == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("this is else");
		}

	}

}
