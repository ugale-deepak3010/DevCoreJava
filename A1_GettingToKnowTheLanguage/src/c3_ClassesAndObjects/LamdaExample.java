package c3_ClassesAndObjects;

interface AnyInterface {
	void hell();
}

public class LamdaExample implements AnyInterface {
	
	@Override
	public void hell() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		LamdaExample lamdaExample = new LamdaExample() {
			@Override
			public void hell() {
				System.out.println("Byee");
			}
		};
		
		lamdaExample.hell();
	}

	

}
