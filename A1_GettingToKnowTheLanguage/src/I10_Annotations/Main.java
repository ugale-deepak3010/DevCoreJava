package I10_Annotations;

@interface ClassPreamble {
	String author();	//element1

	String date();		//element2

	int currentRevision() default 1;

	String lastModified() default "N/A";

	String lastModifiedBy() default "N/A";

	// Note use of array
	String[] reviewers();
}

@ClassPreamble(author = "Deepak Ugale", date = "22-12-2024", reviewers = { "Deepak",
		"Manali Rahangdale" }, currentRevision = 2)
@SuppressWarnings(value = { "unused" })
public class Main {

	public static void main(String[] args) {

		int unusedMe;
		
		System.out.println("Welcome!");
		// Where annotation can be use?

		// Class instance creation expression:
		// new @Interned MyObject();

		// Type cast:
		// myString = (@NonNull String) str;

		// implements clause:
		// class UnmodifiableList<T> implements @Readonly List<@Readonly T> { ... }

		// Thrown exception declaration:
		// void monitorTemperature() throws @Critical TemperatureException { ... }

	}

}
