package c3_ClassesAndObjects.c4_Enums;

import java.util.Arrays;

// All enum supports 
//name(), 
//ordinal() means position in int.
// compareTo() return distance in postion
@SuppressWarnings("unused")
public class SpecialMethods {

	public static void main(String[] args) {

		DayOfWeek[] days = DayOfWeek.values();// values provide array
		Arrays.asList(days).forEach(System.err::println);

		System.out.println(DayOfWeek.valueOf("THURSDAY"));

		System.out.println("Name: " + DayOfWeek.THURSDAY.name()); // THURSDAY
		System.out.println("Ordinal: " + DayOfWeek.THURSDAY.ordinal()); // position 3

		DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

		System.out.println("FROM Mon to Tue: " + dayOfWeek.compareTo(DayOfWeek.TUESDAY)); // Monday 1,
		System.out.println("FROM Mon to Sun: " + dayOfWeek.compareTo(DayOfWeek.SUNDAY)); // Monday -6,

	}

}
