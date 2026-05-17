package c3_ClassesAndObjects.c3_Nexted_InnerClas;

// Anonomus class means either subclass or within isnide method class.
public class LocalClass_AnonymousClass {

	public void methodName() {

		interface OhhImInterface { // interface can create inside method/class !
			int yum = 10;

			void sayHi();

			void sayBy();
		}

		class I_am_LocalClass implements OhhImInterface { // subclass can be create inside method!
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

		I_am_LocalClass anonymousClass = new I_am_LocalClass() { // 'Anonymous' becuase it's can't create outside the method.

			@Override
			public void sayHi() {
				System.out.println(" Heeeeeeeelllllllllloooooooo :" + yum);
			}
		};

		anonymousClass.sayHi();
	} // now method closed

	public static void main(String[] args) {

		// Can not create I_am_LocalClass Object here! becuase it's within the method!

		LocalClass_AnonymousClass obj = new LocalClass_AnonymousClass();
		obj.methodName();

	}

}
