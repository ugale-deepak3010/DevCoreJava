package b2_JavaLanguageBasics.b5_Operators;

class BitDemo {
	public static void main(String[] args) {
		
		int bitmask = 0x000F;
		int val = 0x2222;
		
		// prints "2"
		System.out.println(val & bitmask);	//and
		
		// print 8751
		System.out.println(val | bitmask);	//or
		
		//print 8749
		System.out.println(val ^ bitmask);	// exclusive Or
		
	}
}
