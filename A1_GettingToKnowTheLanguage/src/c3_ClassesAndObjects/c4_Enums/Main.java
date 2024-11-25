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
		case FRIDAY -> System.out.println("The weekend is near.");
		case SATURDAY, SUNDAY -> System.out.println("Weekend");
		default -> throw new AssertionError("Should not happen");
		}

		AbstractMethod a = AbstractMethod.A;
		a.I_am_abstractMethod();
		System.out.println("a= " + a);

	}

}
