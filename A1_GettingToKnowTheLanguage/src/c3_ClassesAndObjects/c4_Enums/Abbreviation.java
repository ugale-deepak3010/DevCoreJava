package c3_ClassesAndObjects.c4_Enums;

public enum Abbreviation {

	MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

	private final String abbreviation_of_day;
	// private final String canNotAdd;

	// Constructor
	Abbreviation(String abbreviation /* ,String canNotAdd */) {
		this.abbreviation_of_day = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation_of_day;
	}

}
