package c3_ClassesAndObjects.c3_Nexted_InnerClas;

public class ShadowTest {

	private int x = 1000;
	
	public void name() {
		ShadowTest.this.x=500;//also can access.
	}

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}

	public static void main(String... args) {
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel fl = st.new FirstLevel();
		
		fl.methodInFirstLevel(23);
	}
}
