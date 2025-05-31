package b2_JavaLanguageBasics.b7_ControlFlow;

/**
 * The last branching statement is the yield statement. The yield statement
 * exits from the current switch expression it is in. A yield statement is
 * always followed by an expression that must produce a value. This expression
 * must not be void. The value of this expression is the value produced by the
 * enclosing switch expression.
 * 
 */
public class YieldStatement {

	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static int calculate(Day d) {

		int result;

// yield helps to return value from switch case! by default switch is only flow and nothing return.
// yield added in java12 for preview a d java13 permanent.
// if yeild was not here we can't use 'result='

		result = 
  
  switch (d) {
		case SATURDAY, SUNDAY -> 0;
		default -> {
			int remainingWorkDays = 5 - d.ordinal();

			yield remainingWorkDays;
		}
		};

		return result;

	}

	public static void main(String[] args) {
		// woring days
		System.out.println(calculate(Day.SUNDAY));
	}

}
