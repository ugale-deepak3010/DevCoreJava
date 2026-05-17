package c3_ClassesAndObjects.c4_Enums;

// Where & why usage 
// DatabaseConnection.INSTANCE.connect();
// if you want use method inside enum, msut be use constroctor and field
public enum SingleToneEnum {

	MY_INTANSACE("instance");

	// SIngletone is standard way! it's keep single enum item!
	private String instance;

	SingleToneEnum(String instance) {

		System.out.println("Instance object created inside constructor");

		this.instance = instance;
	}

	public String getSingleToneEnum() {

		return instance;
	}
}
