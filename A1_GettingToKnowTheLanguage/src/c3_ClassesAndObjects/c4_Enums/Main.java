package c3_ClassesAndObjects.c4_Enums;

public class Main {

	public static void main(String[] args) {

//		Accessing, evaluating, and comparing enums

		DayOfWeek weekStart = DayOfWeek.MONDAY;

		if (weekStart == DayOfWeek.MONDAY) {
			System.out.println("The week starts on Monday.");
		}

		DayOfWeek someDay = DayOfWeek.FRIDAY;

		switch (someDay) {

		case MONDAY -> System.out.println("The week just started.");
		case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("We are somewhere in the middle of the week.");
		case FRIDAY -> System.out.println("The weekend is near."); // try to comment
		// it
		case SATURDAY, SUNDAY -> System.out.println("Weekend");

		default -> throw new AssertionError("Should not happen"); // standard java class!
		}

		AbstractMethod a = AbstractMethod.A; // AbstractMethos is enum. A is method!
		a.I_am_abstractMethod(); // declared single abstract method.
		System.out.println("a= " + a); // A() and B() anaonymous instance within enum

		// ====================================

		Abbreviation abbreviation = Abbreviation.MONDAY; // new keyword, construcor not allow! JVM does it!
		String s = abbreviation.getAbbreviation(); // if needed such method, constroctor needed!
		System.out.println("Abbrebaviation: " + s);

		SingleToneEnum singleToneEnum = SingleToneEnum.MY_INTANSACE;
		String s1 = singleToneEnum.getSingleToneEnum();
		SingleToneEnum singleToneEnum2 = SingleToneEnum.MY_INTANSACE;
		String s2 = singleToneEnum2.getSingleToneEnum();
		System.out.println(s1);
		System.out.println(s2);

	}

}
