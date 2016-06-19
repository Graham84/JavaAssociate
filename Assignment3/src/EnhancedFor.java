
public class EnhancedFor {
	
    public static void main(String args[]) {
        
        // declare string array and initialize with values in one step
        String[] names = { "Graham", "John", "Dean", "Ellen", "Gary", "Val", "Ger" };
 
        // for (data_type variable: array_name)
        for (String name : names) {
            System.out.println(name);
        }
 
    }
 
}
