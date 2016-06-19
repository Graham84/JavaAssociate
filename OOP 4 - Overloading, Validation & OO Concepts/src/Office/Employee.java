package Office;

/**
 *
 * @author Administrator
 */
public class Employee implements Printable {
	private String name;
	private String jobTitle;
	private int employeeID;
	private int level;
	
	/*protected static field - a "class field". There is only one
	 * value for this field shared by all instances of this class.
	 * The static field will be used here to store an integer value
	 * that is incremented from within the calculateEmployeeID method
	 * to generate the next ID value. The employeeIDCounter is accessed
	 * and incremented by all instances of Employee and its subclasses,
	 * thus ensuring that no duplicate employee IDs are generated*/
	protected static int employeeIDCounter = 0;
	
	@Override
	public void print() {
		System.out.println("Name: " + getName());
		System.out.println("Job Title: " + getJobTitle());
		System.out.println("Employee ID: " + getEmployeeID());
		System.out.println("Level: " + getLevel());
	}

	public void calculateEmployeeID() {
		employeeIDCounter++; // ensuring uniqueness for the emp ID
		this.setEmployeeID(employeeIDCounter);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID
	 *            the employeeID to set
	 *            		private to ensure uniqueness
	 */
	private void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

}
