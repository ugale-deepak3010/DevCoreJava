package k12_Exceptions.k2_TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static String readFirstLineFromFile(String path) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			br.close(); // must be close.
			return line; // can't use for return readline.
		} finally {

		}
	}

	static String readFirstLineFromFile_v2(String path) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {		//		resource will automatically close once use.
			return br.readLine();
		}
	}

	public static void main(String[] args) throws IOException {

		System.out.println("Welcome");
		String line1 = Main.readFirstLineFromFile("/home/dipakugale/Music/TestFolder/test.txt");
		System.err.println(line1);

		String line_1 = Main.readFirstLineFromFile("/home/dipakugale/Music/TestFolder/test.txt");
		System.err.println(line_1);

	}
}
