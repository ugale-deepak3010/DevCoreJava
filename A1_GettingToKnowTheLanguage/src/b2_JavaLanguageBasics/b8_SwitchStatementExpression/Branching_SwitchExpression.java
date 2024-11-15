package b2_JavaLanguageBasics.b8_SwitchStatementExpression;

import b2_JavaLanguageBasics.b7_ControlFlow.YieldStatement.Day;

public class Branching_SwitchExpression {

	public static void main(String[] args) {

		Day day = Day.SATURDAY; // any day
		int len = 0;
		switch (day) {
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			len = 6;
			break;
		case TUESDAY:
			len = 7;
			break;
		case THURSDAY:
		case SATURDAY:
			len = 8;
			break;
		case WEDNESDAY:
			len = 9;
			break;
		default:
			len = 0;
		}
		System.out.println("len = " + len);

		// MODIFIED

		Day day2 = Day.SUNDAY; // any day
		len = switch (day2) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> 0;
		};
		System.out.println("len = " + len);

	}

	
	public String convertToLabel(int quarter) {
		String quarterLabel = switch (quarter) {
		case 0 -> {
			System.out.println("Q1 - Winter");
			// return "Q1 - Winter"; as per lambda BUT NOT WORKING!
			yield "Q1 - Winter";
		}
		default -> "Unknown quarter";
		};
		return quarterLabel;
	}
	
	
	//Writing Colon Case in Switch Expressions

	int quarter = 3; // any value

	String quarterLabel =
	    switch (quarter) {
	        case 0 :  yield "Q1 - Winter";
	        case 1 :  yield "Q2 - Spring";
	        case 2 :  yield "Q3 - Summer";
	        case 3 :  yield "Q3 - Summer";
	        default: System.out.println("Unknown quarter");
	                 yield "Unknown quarter";
	    };
	    
	  


}
