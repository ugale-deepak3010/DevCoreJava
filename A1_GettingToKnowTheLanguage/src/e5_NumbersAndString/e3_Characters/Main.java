package e5_NumbersAndString.e3_Characters;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		char ch = 'a';
		// Unicode for uppercase Greek omega character
		char uniChar = '\u03A9';

		System.out.println("uniChar: " + uniChar);

		// an array of chars
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

		@SuppressWarnings("removal")
		Character ch2 = new Character('a');
		Character v2 = Character.valueOf('a');// replcement if Character constroctor.

		System.out.println("She said \"Hello!\" to me.");

	}

}
