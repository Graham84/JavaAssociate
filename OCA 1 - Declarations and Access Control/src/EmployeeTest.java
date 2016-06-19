import java.text.NumberFormat;


public class EmployeeTest {

	public static void main(String[] args) {
		
		Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678,", 120_345.27);
		
		Manager mgr = new Manager(207, "Barbara Jones", "054-12-2367", 109_501.36, "Marketing");
		
		Admin adm = new Admin(304, "Bill Monroe", "108-23-6059", 75_002.34);
		
		Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 100_000.00);
		
		printEmployee(eng);
		printEmployee(mgr);
		printEmployee(adm);
		printEmployee(dir);
		
		System.out.println("\nTesting raiseSalary and setName on Manager:");
		mgr.setName("Barbara Johnson");
		mgr.raiseSalary(10000);
		printEmployee(mgr);
	}
	
		public static void printEmployee (Employee emp) {
			System.out.println(); //blank line seperator
			// print out the data in employee object
			System.out.println("Emplyee ID: \t\t" + emp.getEmpId());
			System.out.println("Employee Name: \t\t" + emp.getName());
			System.out.println("Employee Soc Sec #: \t" + emp.getSsn());
			System.out.println("Employe Salary: \t" + NumberFormat.getCurrencyInstance().format((double)emp.getSalary()));
		}

}
