package c3_ClassesAndObjects.c4_Enums;

@SuppressWarnings("unused")
public class SpecialMethods {

	public static void main(String[] args) {

		DayOfWeek[] days = DayOfWeek.values();

		System.out.println(DayOfWeek.valueOf("THURSDAY"));

		System.out.println(DayOfWeek.THURSDAY.name()); // THURSDAY
		System.out.println(DayOfWeek.THURSDAY.ordinal()); //

		DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY;

		System.out.println("FROM MONDAY: " + dayOfWeek.compareTo(DayOfWeek.MONDAY));

	}

}
