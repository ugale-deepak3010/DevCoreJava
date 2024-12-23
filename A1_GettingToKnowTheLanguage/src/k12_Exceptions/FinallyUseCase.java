package k12_Exceptions;

public class FinallyUseCase {
	public static void main(String[] args) {
		try {

			try {
				int x = 2 / 0;
				System.out.println(x);
				
			} finally {

				if (System.out != null) {
					System.out.println("Out object was open, just closing");
					System.out.close();
				} else {
					System.out.println("Out object was not opened");
				}
				System.out.println("System.out already close so, this will not print!");
			}
			// not catched exception so program will through exception NOW.
		} catch (Exception e) {
			System.err.println("Exception thrown after finally! \n" + e);
		}

	}

}
