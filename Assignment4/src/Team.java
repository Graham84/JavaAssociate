public class Team {

	// one attribute
	private String teamName;

	// empty constructor
	public Team() {
		// teamName initialised to null (all Strings initialise to null if not
		// set)
		// (all integers initialise to 0 is not set)
	}

	// teamName constructor
	public Team(String teamName) {
		this.teamName = teamName;
	}

	// getter method
	public String getTeamName() {
		return teamName;
	}

	// setter method
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	// override the objects toString() method
	@Override
	public String toString() {
		return "[" + teamName + "]";
	}

	// override the objects equals() method
	@Override
	public boolean equals(Object team) {
		if (this == team)
			return true;
		if (team == null)
			return false;
		if (getClass() != team.getClass())
			return false;
		Team other = (Team) team;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}

} // end class
