package d4_RecordToModel.d1_SimpleRecord;

//	fields
//	getters and setters
//	parameterized constructor
//	toString
public class EmployeeClass {

	long id;
	String name;
	String department;

	public EmployeeClass(long id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeClass [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
