package c3_ClassesAndObjects.c3_Nexted_InnerClas;

public class LocalClass_AnonymousClass {

	public void methodName() {

		
		interface OhhImInterface {
			int yum = 10;

			void sayHi();
			void sayBy();
		}

		class I_am_LocalClass implements OhhImInterface {
			int x = 5;

			@Override
			public void sayHi() {
				System.out.println("Hiii :" + yum);
			}

			@Override
			public void sayBy() {
				System.out.println("Byyee");
				
			}
		}

		I_am_LocalClass onlyCreateObjectWithinThisMethod = new I_am_LocalClass();
		System.out.println(onlyCreateObjectWithinThisMethod.x);

		I_am_LocalClass anonymousClass = new I_am_LocalClass() {
			@Override
			public void sayHi() {
				System.out.println("Heeeeeeeelllllllllloooooooo :" + yum);
			}
		};
		anonymousClass.sayHi();
	}

	public static void main(String[] args) {
		// can not create I_am_LocalClass Object here!
		
		LocalClass_AnonymousClass obj=new LocalClass_AnonymousClass();
		obj.methodName();
	}

}
