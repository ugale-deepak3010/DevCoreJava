package c3_ClassesAndObjects.c2_CreatingAndUsingObj;
@SuppressWarnings("unused")
public class MainClass {
	
	int number=5;
	static int number2=5;
	
	public void hello() {
		System.out.println("Hello");
	}
	public static void hello2() {
		System.out.println("hello2");
	}
	
	
	public static void main(String[] args) {
		
		int num= new MainClass().number;
		int num2= number2;
		num2=MainClass.number2;
		
		new MainClass().hello();
		MainClass.hello2();
	}

}
