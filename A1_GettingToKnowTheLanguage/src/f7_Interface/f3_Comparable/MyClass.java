package f7_Interface.f3_Comparable;

public class MyClass implements Interface1 {
	private int orderSequence;

	public MyClass(int orderSequence) {
		this.orderSequence = orderSequence;
	}

	@Override
	public int compareTo(Interface1 other) {
		// Check for incompatible type and throw exception
		if (!(other instanceof MyClass)) {
			throw new IllegalArgumentException("Incompatible type: Cannot compare with objects of different classes");
		}

		MyClass otherClass = (MyClass) other;
		return Integer.compare(this.orderSequence, otherClass.orderSequence);
	}

	@Override
	public String toString() {
		return "MyClass [orderSequence=" + orderSequence + "]";
	}

}