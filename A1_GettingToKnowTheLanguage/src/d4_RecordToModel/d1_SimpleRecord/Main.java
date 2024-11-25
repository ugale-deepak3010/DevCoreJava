package d4_RecordToModel.d1_SimpleRecord;

public class Main {

	public static void main(String[] args) {

		EmployeeClass empC1 = new EmployeeClass(1, "Deepak", "Corrigo");
		System.out.println(empC1.toString());

		EmployeeRecord emp2 = new EmployeeRecord(1, "Deepak", "Corrigo");
		System.out.println(emp2.toString());

	}

}
