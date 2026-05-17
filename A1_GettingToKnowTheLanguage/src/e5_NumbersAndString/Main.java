package e5_NumbersAndString;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		double zero = Math.random(); // ??????????? 0-0.9
		int houndred = (int) (Math.random() * 100); // 0-100 NOTE: int only parse first item so 0 *100=0 so () req.
		System.out.println("0-100  : " + houndred);

		int thousand = (int) (Math.random() * 1_000);
		System.out.println("0-1,000 = " + thousand);

		int numberUp10 = (int) (Math.random() * 10);

		System.out.println(numberUp10);

		System.err.println(Math.random()); // 0.0 to 0.9

		int i = 500;
		float gpa = 3.65f;
		byte mask = 0x7f;

		System.out.format("Here is int= %d \n" + "Here is float %f \n" + "Here is the byte " + mask, i, gpa);

	}

}
