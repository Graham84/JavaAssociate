
public class Manager extends Employee{
	
	private String deptName;

	public Manager(int empId, String name, String ssn, double salary, String deptName) {
		super(empId, name, ssn, salary);
		// TODO Auto-generated constructor stub
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

}
