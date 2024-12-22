package h9_Lamda.h1_WritingFirstExp;

@FunctionalInterface
interface Hello {
	public void goodMorning();// abstract method
}

//  @FunctionalInterface helpe is optinal
interface IamAlsoFunctionInterface {
	public void goodNight();
}

public class Main {

	public static void main(String[] args) {

		Hello hello = new Hello() {

			@Override
			public void goodMorning() {
				System.out.println("Happy morning!");
			}
		};

		System.out.print("Hello Depak, ");
		hello.goodMorning();
		
		
		IamAlsoFunctionInterface bye= new IamAlsoFunctionInterface() {
			
			@Override
			public void goodNight() {
				System.out.println("Good Night!");
			}
		};
		
		bye.goodNight();
	}
}
