package f6_Inheritance.f4_Polymorphism;

public class WhySameNameParameterNotAllow {

	public void disp(int x) {
		System.out.println(x);
	}

	public int disp_NotAllow(int x) {
		System.out.println(x);

		return 0;
	}

	// Java enforce: Signature should be proper is main reason --Ambiguity

	//1234
	public void show(int x) {
		System.err.println(x);
	}

	//1234L
	public int show(long x) {
		System.out.println(x);

		return 0;
	}

}
