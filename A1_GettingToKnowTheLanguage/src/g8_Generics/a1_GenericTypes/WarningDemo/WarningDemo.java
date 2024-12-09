package g8_Generics.a1_GenericTypes.WarningDemo;

import g8_Generics.a1_GenericTypes.GenericBox;

@SuppressWarnings("unchecked")
public class WarningDemo {

	@SuppressWarnings("unused")			//ignore this annotations.
	public static void main(String[] args) {
		GenericBox<Integer> bi;
		bi = createBox();
	}

	@SuppressWarnings("rawtypes")
	static GenericBox createBox() {
		return new GenericBox();
	}
}
