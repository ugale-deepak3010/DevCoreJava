package g8_Generics.a3_WildCards;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	//only integer will accept
	public void printUpperBound(List<? extends Integer> numList) {
		for (Number number : numList) {
			System.out.println(number);
		}
	}
	public void printLowerBound(List<? super Integer> numList) {
		for (Object number : numList) {
			System.out.println(number);
		}
	}
	
	public void printList(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public <T> void print(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		t1.print(8);
		t1.print("Deepak");
		
		List<String> names= new ArrayList<>();
		names.add("Deepak");
		names.add("Manali");
		
		t1.printList(names);
		
		List<Integer> ages=new ArrayList<>();
		ages.add(27);
		ages.add(26);
		
		t1.printList(ages);
		t1.printUpperBound(ages);
		
		List<Float> experience= new ArrayList<>();
		experience.add(5.5f);
		experience.add(3.5f);
		//t1.printUpperBound(experience); 	// 	Error!! UpperBound not integer
		
		List<Number> exp=new ArrayList<>();
		exp.add(5.5f);
		exp.add(3.5f);
		//t1.printUpperBound(exp); 	//	Number is super class of Integer but still not able access.
		
		//	NOW UPPER LOWER BOUND IS NEEDED
		
		t1.printLowerBound(ages);
		t1.printLowerBound(exp);
		
		List<Object> listObj=new ArrayList<>();
		listObj.add(new Test1());
		t1.printLowerBound(listObj);
		
		
	}

}
