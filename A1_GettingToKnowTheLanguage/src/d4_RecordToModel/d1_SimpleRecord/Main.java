package d4_RecordToModel.d1_SimpleRecord;

public class Main {

	public static void main(String[] args) {

		// Record

		EmployeeClass empC1 = new EmployeeClass(1, "Deepak", "Corrigo");
		System.out.println(empC1.toString());

		// Record are immutable! once created can't change!
		EmployeeRecord emp2 = new EmployeeRecord(1, "Deepak", "Corrigo");
		System.out.println(emp2.toString());

		empC1.name = "Manali";
		// emp2.name() // IMMUTABLE CAN'T CHANGE!

	}
}