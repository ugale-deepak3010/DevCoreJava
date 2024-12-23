package I10_Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Greeting {
	String name();

	boolean invokeMethod() default false; // Optional

	String invokeMethodName() default ""; // Optional
}

@Greeting(name = "Deepak", invokeMethod = true, invokeMethodName = "myMethod")
class Deepak {
	public void myMethod() {
		System.out.println("myMethod is executed");
	}

	public void anotherMethod() {
		System.out.println("Another Method");
	}
}

public class AnnotationExample {

	public static void main(String[] args) {
		System.out.println("Welcome");

		Class<Deepak> objClass = Deepak.class;

		if (objClass.isAnnotationPresent(Greeting.class)) {

			Greeting greeting = objClass.getAnnotation(Greeting.class);

			String name = greeting.name();
			System.out.println("Good Day dear " + name);

			if (greeting.invokeMethod()) {

				Method[] methods = objClass.getDeclaredMethods();
				String methodName = greeting.invokeMethodName();

				for (Method method : methods) {
					if (methodName.equals(method.getName())) {
						try {
							Deepak deepak = objClass.getDeclaredConstructor().newInstance();
							method.invoke(deepak, (Object[]) null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			} else {
				System.out.println("Greeting are disabled!");
			}

		} else {
			System.out.println("Unable to find annotation");
		}

	}
}
