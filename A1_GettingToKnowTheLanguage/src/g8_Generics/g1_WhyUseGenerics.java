package g8_Generics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
public class g1_WhyUseGenerics {

	public static void main(String[] args) {

		List list = new ArrayList();						//		RAW TYPE | Accept String, Int, or Any class or other type.
		List<String> list2 = new ArrayList<String>();		//		Generci Type		|	

		list.add("hello");
		list2.add("hello");

		String str = (String) list.get(0);
		String str2 = list2.get(0); 			// no cast if use generics

	}

}
