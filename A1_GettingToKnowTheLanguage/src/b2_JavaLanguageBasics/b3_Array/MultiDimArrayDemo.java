package b2_JavaLanguageBasics.b3_Array;

class MultiDimArrayDemo {
	public static void main(String[] args) {

		String[][] names = { 
				{ "Mr. ", "Mrs. ", "Ms. " }, 
				{ "Smith", "Jones" } 
				};
		
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);

	}

	public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) {

	}

}
