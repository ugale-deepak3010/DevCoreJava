package f7_Interface.f3_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Salary salary50k = new Salary(50_000);
		Salary salary75k = new Salary(75_000);
		
		salary50k.compareTo(45_000);
		
		salary50k.compareTo(salary75k.salary);
		
		Mark mark50 = new Mark(50);
		Mark mark70 = new Mark(70);
		
		mark50.compareTo(mark70);
		
		// order by Highest marks
		
		List<Mark> marks= new ArrayList<>();
		marks.add(mark50);
		marks.add(mark70); 
		Collections.sort(marks, Comparator.reverseOrder());
		
		marks.forEach(m -> System.out.println("Mark Sorted: "+m.makr));
		
		// order by Hghest mark using Comparator
		
		Car car1= new Car(0001, 100);
		Car car2= new Car(0022, 400);
		Car car3= new Car(0333, 200);
		Car car4= new Car(4444, 300);
		
		Comparator<Car> carComparatorBySpeed = (carNum1, carNum2) ->{
			return Integer.compare(carNum1.speed, carNum2.speed);
		};
		
		List<Car> cars= new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		
		cars.forEach(car -> System.out.println("before Car Sorting: "+car));
		Collections.sort(cars, carComparatorBySpeed);
		cars.forEach(car -> System.err.println("After Car Sorting: "+car));

		
		
		
		// note: Always collection sort required Mark type in list same for Comparable we should extended! Salary in Integer usedXX
		
//--------------------------------------------------------------		
		
		MyClass obj1 = new MyClass(5);
		MyClass obj2 = new MyClass(3);
		MyClass obj3 = new MyClass(10);

		System.out.println(obj1.compareTo(obj2)); // Output: -1

		List<MyClass> classes = new ArrayList<>();

		 //classes=List.of(obj1,obj2,obj3); // List.Of() is immutable so Collections will not work

		// ArrayList<MyClass> classes2=new ArrayList<>(classes); this this will be
		// way!!!!!!!!!!!!

		classes.add(obj1);
		classes.add(obj2);
		classes.add(obj3);

		classes.stream().sorted().forEach(obj -> System.err.println(obj));

		classes.stream().forEach(obj -> System.out.println(obj));

		try {
			Collections.sort(classes);
		} catch (IllegalArgumentException e) {
			System.err.println("Sorting failed: " + e.getMessage());
		}

		System.err.println("After Sorting");
		classes.stream().forEach(obj -> System.err.println(obj));

	}

}



class Salary implements Comparable<Integer> {

	public int salary;
	
	public Salary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Integer inputSalary) {
		if (this.salary == inputSalary.intValue()) {
			return 0;
		}
		
		return (this.salary > inputSalary.intValue()) ? 1:-1; // Integer.compare(salary, inputSalary);
	}

}


class Mark implements Comparable<Mark> { // Mark is industry standard domain compare! Integer compare is not domain! 

	int makr;
	
	public Mark(int mark) {
		this.makr = mark;
	}
	
	@Override
	public int compareTo(Mark inputMark) {
		return Integer.compare(this.makr, inputMark.makr);
	}
}


class Car{
	
	int carNumber;
	int speed;

	public Car(int carNumber, int speed) {
		this.carNumber = carNumber;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", speed=" + speed + "]";
	}

}

















