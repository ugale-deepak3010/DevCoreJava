package l13_RefactoringFromImperativeToFunctionalStyle.l5_DatasourceToStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FindPublicWordsInFile {

	public static void main(String[] args) {

		String filePath = "/home/dipakugale/eclipse-workspace/eclipse_workplace2/DevCoreJava/A1_GettingToKnowTheLanguage/src/l13_RefactoringFromImperativeToFunctionalStyle/l5_DatasourceToStreams/";
		String fileName = "Sample.java";
		String searchWord = "public";

		// way 1
		try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath + fileName))) {
			int publicCount = 0;
			String line = "";
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				if (line.contains(searchWord)) {
					publicCount++;
				}
			}
			System.err.format("Found %d words as a \"%s\"", publicCount, searchWord);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// way 2
		try (Stream<String> stream = Files.newBufferedReader(Path.of(filePath + fileName)).lines()) {

			int publicCount = (int) stream.filter(line -> line.contains(searchWord)).count();

			System.err.format("\nFound %d words as a \"%s\"", publicCount, searchWord);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
