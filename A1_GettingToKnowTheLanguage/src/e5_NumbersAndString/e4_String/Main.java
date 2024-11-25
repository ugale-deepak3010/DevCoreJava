package e5_NumbersAndString.e4_String;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		String greeting = "Hello world!";

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		// STRING LENGTH

		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();

		// CONCATANATION

		String string1 = "Hello ";
		String string2 = "Deepak";
		string1.concat(string2);

		"My name is ".concat("Rumplestiltskin");

		String string3 = "Hello," + string2 + "!";

		// MULTILINE STRING

		String quote = "Now is the time for all good " + "men to come to the aid of their country.";

		String html = """
				<html>
				    <body>
				        <p>Hello, world</p>
				    </body>
				</html>
				""";

		// FORMATTING STRING
		String fs;
		float floatVar = 1.23f;
		int intVar = 9;
		String stringVar = "Hii";

		fs = String.format("The value of the float " + " variable is %f, while " + "\n the value of the "
				+ "\n integer variable is %d, " + "\n and the string is %s", floatVar, intVar, stringVar);

		System.out.println(fs);

	}

}
