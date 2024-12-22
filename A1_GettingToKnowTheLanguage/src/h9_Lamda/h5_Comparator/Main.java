package h9_Lamda.h5_Comparator;

import java.util.Comparator;

public class Main {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Comparable<String> comparable = null;		
		comparable.compareTo(null);
		comparable.equals(null);
		
		Comparator<String> comparator = null;	
		comparator.compare(null, null);
		comparator.equals(comparator);
		Comparator.naturalOrder();
		comparator.reversed();
		
		
		
	}

}
