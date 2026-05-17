package c3_ClassesAndObjects.c4_Enums;

public enum Abbreviation {

	MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

	// private final String canNotAdd;

	// Constructor
	// Constroctor can't call by user! it's created by JVM!
	// Enum don't allow new keyword!
	// Enum
	private final String abbreviation_of_day;

	Abbreviation(String abbreviation /* ,String canNotAdd */) {
		this.abbreviation_of_day = abbreviation;
	}

	public String getAbbreviation() { // this is method inside Enum but without constructor can't use!
		return abbreviation_of_day;
	}

}
