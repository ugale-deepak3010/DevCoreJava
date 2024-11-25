package e5_NumbersAndString;

public class Main {

	public static void main(String[] args) {

		int numberUp10 = (int) (Math.random() * 10);
		System.out.println(numberUp10);

		System.err.println(Math.random()); // 0.0 to 0.9

		int i = 500;
		float gpa = 3.65f;
		byte mask = 0x7f;

		System.out.format("here is int= %d \n" + "Here is float %f \n" + "Here is the byte " + mask, i, gpa);
	}

}
