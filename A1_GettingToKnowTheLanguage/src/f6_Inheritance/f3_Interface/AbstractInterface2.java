package f6_Inheritance.f3_Interface;

public interface AbstractInterface2 {

	public void hello();

	public default void sameName() {
		System.out.println("sameName");
	}
}
