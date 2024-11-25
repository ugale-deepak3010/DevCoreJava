package c3_ClassesAndObjects.c4_Enums;

enum AbstractMethod {

	A() {
		@Override
		public void I_am_abstractMethod() {
			System.out.println("Helllllloooooooo");
		}
	}, // <---------------------------------------- Comma here!

	B() {
		@Override
		public void I_am_abstractMethod() {
			System.out.println("BBBBBBBBBBB");
		}
	};

	abstract void I_am_abstractMethod();

}
