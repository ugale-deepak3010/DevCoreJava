package d4_RecordToModel.d2_AdditionalDeclarations;

public record Employee(long id, String name, String department) {

//	int x;		can't add
//	int y=5;	can't add		//can't add getter& setters
	static int z = 5;
	static String a;

	public String getEmployeeKundali() {
		return "Engineering in " + this.department;
	}
}
