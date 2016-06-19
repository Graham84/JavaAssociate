public class TeamTest {

	// main method
	public static void main(String[] args) {

		// using the empty constructor
		Team t1 = new Team();
		// should print out Team [null]
		System.out.println(t1);

		// using the teamName constructor to initialise 2 Team objects
		Team t2 = new Team("Spurs");
		Team t3 = new Team("Cork City");

		// test methods
		// print using getter
		System.out.println(t2.getTeamName());
		// print using override toString() - without override Team@15db9742
		// would display
		System.out.println(t3);

		// false - if statement checking teamName using equals() override
		if (t2.equals(t3))
			System.out.println(t2 + " equals " + t3);
		else
			System.out.println(t2 + " does not equal " + t3);

		// using setter method to change t3 name
		t3.setTeamName("Spurs");
		System.out.println(t2);
		System.out.println(t3);

		// true - if statement checking teamName using equals() override
		if (t2.equals(t3))
			System.out.println(t2 + " equals " + t3);
		else
			System.out.println(t2 + "does not equal " + t3);

	} // end method

} // end class
