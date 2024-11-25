package c3_ClassesAndObjects.c4_Enums;

public enum SingleToneEnum {

	MY_INTANSACE("instance");

	private String instance;

	SingleToneEnum(String instance) {
		this.instance = instance;
	}

	public String getSingleToneEnum() {
		return instance;
	}
}
