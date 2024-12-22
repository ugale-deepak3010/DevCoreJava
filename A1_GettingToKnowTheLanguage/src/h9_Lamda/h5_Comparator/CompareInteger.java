package h9_Lamda.h5_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class NormalAge {

}

//-1 means less than, 0 means equal, +1 means greater
// Comparable type can be anything......
class Age implements Comparable<Age> {

	public int age;
	public String name;

	public Age(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Age o) {

		if (this.age < o.age) {
			return -1; // Current age is less than the other
		} else if (this.age > o.age) {
			return 1; // Current age is greater than the other
		}
		return 0; // Both ages are equal
	}
}

public class CompareInteger {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		Comparator<String> comparator_v2 = String::compareTo;

		// ----------------------------------------------

		Comparator<Integer> NumberComparator = (age1, age2) -> age1.compareTo(age2);
		NumberComparator.compare(25, 26);

		Age deepakAge = new Age(26, "Deepak");
		Age manaliActualAge = new Age(26, "Manali Actual Age");
		Age manaliThinkAge = new Age(25, "Manali What she thinks");
		Age manaliGirlAge = new Age(1, "Manali Her Girl");

		int res = NumberComparator.compare(deepakAge.age, manaliThinkAge.age);
		System.err.println(res);

		// -------------------------------------------------- List

		List<Age> ages = new ArrayList<>();
		ages.add(deepakAge);
		ages.add(manaliThinkAge);
		ages.add(manaliActualAge);
		ages.add(manaliGirlAge);

		ages.forEach(age -> System.out.println(age.age + " " + age.name));

		Comparator<Age> ageComparator = (age1, age2) -> age1.compareTo(age2);
		ages.sort(ageComparator);

		// alternatives
		ages.sort(Comparator.comparingInt(age -> age.age));
		// OR
		// ages.sort((age1, age2) -> age1.compareTo(age2.age));
		ages.sort(Age::compareTo);

		ages.forEach(age -> System.err.println(age.age + " " + age.name));

	}

}
