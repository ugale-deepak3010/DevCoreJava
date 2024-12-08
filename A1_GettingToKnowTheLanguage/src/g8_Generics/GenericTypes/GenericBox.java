package g8_Generics.GenericTypes;

/*

T - Type

K - Key
V - Value

E - Element

N - Number

S, U, V etc. - 2nd, 3rd, 4th types

*/
@SuppressWarnings("unused")
public class GenericBox<T> {	
	
	public GenericBox(T t) {
		setT(t);
	}
	
	

	public GenericBox() {
	}



	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {

		GenericBox<Integer> age = new GenericBox<>(4);
		age.setT(5);
		Integer myAge = age.getT();

		// The Diamond
		GenericBox<String> name = new GenericBox<>("XYZ");
		name.setT("Deepak Manali");
		String myName = name.getT();
	}

}
