package b2_JavaLanguageBasics.b8_SwitchStatementExpression;

import java.util.ArrayList;
import java.util.List;

public class Branching_SwitchStatement {

	public static void main(String[] args) {

		int quarter = 3; // any value

		String quarterLabel = null;
		switch (quarter) {
		case 0:
			quarterLabel = "Q1 - Winter";
			break;
		case 1:
			quarterLabel = "Q2 - Spring";
			break;
		case 2:
			quarterLabel = "Q3 - Summer";
			break;
		case 3:
			quarterLabel = "Q3 - Summer";
			break;
		default:
			quarterLabel = "Unknown quarter";
		}
		;

		System.out.println(quarterLabel);

		// *********************

		int month = 8;

		List<String> futureMonths = new ArrayList<>();

		switch (month) {
		case 1:
			futureMonths.add("January");
		case 2:
			futureMonths.add("February");
		case 3:
			futureMonths.add("March");
		case 4:
			futureMonths.add("April");
		case 5:
			futureMonths.add("May");
		case 6:
			futureMonths.add("June");
		case 7:
			futureMonths.add("July");
		case 8:
			futureMonths.add("August");
		case 9:
			futureMonths.add("September");
		case 10:
			futureMonths.add("October");
		case 11:
			futureMonths.add("November");
		case 12:
			futureMonths.add("December");
			break;
		default:
			break;
		}

		// **********************

		month = 2;
		int year = 2021;
		int numDays = 0;

		switch (month) {
		case 1:
		case 3:
		case 5: // January March May
		case 7:
		case 8:
		case 10: // July August October
		case 12:
			numDays = 31;
			break;
		//----------------	
		case 4:
		case 6: // April June
		case 9:
		case 11: // September November
			numDays = 30;
			break;
		//----------------------
		case 2: // February
			if (	(	(year % 4 == 0) && !(year % 100 == 0)) 		|| (year % 400 == 0)	)
				//leap year
				numDays = 29;
			else
				numDays = 28;
			break;
		//------------------------------
		default:
			System.out.println("Invalid month.");
			break;
		}
		System.out.println(numDays);
		//******************************************************
		
		
		String monthS = "march"; // any month
		int monthNumber = -1;

		switch (monthS.toLowerCase()) {
		    case "january":
		        monthNumber = 1;
		        break;
		    case "february":
		        monthNumber = 2;
		        break;
		    case "march":
		        monthNumber = 3;
		        break;
		    case "april":
		        monthNumber = 4;
		        break;
		    case "may":
		        monthNumber = 5;
		        break;
		    case "june":
		        monthNumber = 6;
		        break;
		    case "july":
		        monthNumber = 7;
		        break;
		    case "august":
		        monthNumber = 8;
		        break;
		    case "september":
		        monthNumber = 9;
		        break;
		    case "october":
		        monthNumber = 10;
		        break;
		    case "november":
		        monthNumber = 11;
		        break;
		    case "december":
		        monthNumber = 12;
		        break;
		    default: 
		        monthNumber = 0;
		        break;
		}
		
		System.out.println(monthNumber);

	}

}
