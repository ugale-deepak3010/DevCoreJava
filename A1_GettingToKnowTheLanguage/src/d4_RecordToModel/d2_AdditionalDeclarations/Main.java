package d4_RecordToModel.d2_AdditionalDeclarations;

import java.util.List;

public class Main {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {

		// Apply validation using constructor.
		CanonicalConstructor canonicalConstructor = new CanonicalConstructor(4, 8); // can't set 3 instead of 8
		System.out.println("Min: " + canonicalConstructor.min());
		System.out.println("Max: " + canonicalConstructor.max());

		// ===== access static fields & custom methods =======

		Employee employee = new Employee(123, "Deepak", "Integration");
		System.out.println("employee: " + employee);

		System.out.println("Kundali: " + employee.getEmployeeKundali());

		System.out.println("z: " + employee.z);
		System.out.println("a: " + employee.a);

		// employee.department = "Can't change or allowed"

		// ======== Multple declared constroctors ========
		State state = new State("MH", "Mumbai");
		State state2 = new State("MH", "Mumbai", List.of("Kolhapur", "Jalna", "Gondia"));
		State state3 = new State("MH", "Mumbai", "Kolhapur", "Gondia", "Jalna");

	}

}
