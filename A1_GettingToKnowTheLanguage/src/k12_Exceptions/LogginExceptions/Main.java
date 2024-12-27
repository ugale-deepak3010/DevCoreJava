package k12_Exceptions.LogginExceptions;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		try {
			
			FileHandler handler = new FileHandler("/home/dipakugale/Music/TestFolder/OutFile.log");
			Logger.getLogger("").addHandler(handler);
			System.out.println("Logging");
			throw new ArithmeticException("Manually Triigered by Deepak!");
		} catch (Exception e) {
			System.out.println("Exception: " + e);

			try {
				Logger logger = Logger.getLogger("k12_Exceptions.LogginExceptions");
				StackTraceElement elements[] = e.getStackTrace();
				for (int i = 0, n = elements.length; i < n; i++) {
					logger.log(Level.WARNING, elements[i].getMethodName());
					logger.log(Level.SEVERE, "Something went wrong, please check", e.getMessage());
				}

				System.out.println("Logged successfully");

			} catch (Exception e2) {
				System.out.println("Exception2: " + e2);
			}
		}

	}
}
