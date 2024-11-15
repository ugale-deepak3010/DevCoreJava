package c3_ClassesAndObjects.c1_CreatingClasses;

import java.awt.Point;
import java.awt.Polygon;

public class MyClass {
	// field, constructor, and
	// method declarations

	public int cadence;
	public int gear;
	public int speed;

	
	//Passing Information to a Method or a Constructor

	public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
		double interest = rate / 100.0;
		double partial1 = Math.pow((1 + interest), -numPeriods);
		double denominator = (1 - partial1) / interest;
		double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
		return answer;
	}
	
	
	public Polygon polygonFrom(Point[] corners) {
	    // method body goes here
		return null;
	}
	public Polygon polygonFrom0(int corners) {
	    // method body goes here
		return null;
	}
	
	//******************************************************
	//Arbitrary Number of Arguments
	public Polygon polygonFrom2(Point... corners) {
	   	    
	    return null;
	}

	
	
	//public PrintStream printf(String format, Object... args)
	//System.out.printf("%s: %d, %s%n", name, idnum, address);
	//System.out.printf("%s: %d, %s, %s, %s%n", name, idnum, address, phone, email);

	public void typeParameter(int primitiveType) {
		
	}
	
	public void referenceType(DataArtist referenceType) {
		
	}


}

// 		OVERLOADING METHOD 

class DataArtist {
	public void draw(String s) {

	}

	public void draw(int i) {

	}

	public void draw(double f) {

	}

	public void draw(int i, double f) {

	}
}
