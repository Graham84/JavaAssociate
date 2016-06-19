
public class StringMethods {

	public static void main(String[] args) {
		
		String s = "I like cake. Mmm cake";
		String[] words = {"funk","chunk","furry","baconator"};
		String a = " Bacon ";
		String b = "monster";
		String c = "      ola       ";
		
		System.out.println(a + b);
		System.out.println(a.concat(b));
		System.out.println(a.replace('B','J'));
		System.out.println(a.toUpperCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(c.trim());
		System.out.println(c.toUpperCase().trim().concat(a.toUpperCase()).concat(b.toUpperCase()));

		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf('c',8));
		System.out.println(s.indexOf('x'));
		System.out.println(s.indexOf("like"));
		System.out.println(s.indexOf("mmm"));
		System.out.println(s.indexOf("Mmm"));
		System.out.println(s.indexOf("cake",9));
		
		//startsWith
		for(String w : words) {
			if(w.startsWith("fu"))
				System.out.println(w + " starts with fu");
		}
		
		//endsWith
				for(String w : words) {
					if(w.endsWith("unk"))
						System.out.println(w + " starts with unk");
		}
	}

}
