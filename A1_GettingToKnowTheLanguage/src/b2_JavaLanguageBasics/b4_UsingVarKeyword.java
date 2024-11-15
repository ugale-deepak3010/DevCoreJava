package b2_JavaLanguageBasics;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@SuppressWarnings("unused")
public class b4_UsingVarKeyword {

	//	CAN'T USE FOR FIELDS! 
//	var x=10;
	
	
	//	CAN'T USE FOR Parameter or Return data type!
//	public var disp(var Message) {
//		return Message;	
//	}

	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		/** 	The Var Keyword 	*/
		String message1 = "Hello world!";
		Path path1 = Path.of("debug.log");
		InputStream stream1 = Files.newInputStream(path1);
		
		//******************
		
		var message = "Hello world!";
		var path = Path.of("debug.log");
		var stream = Files.newInputStream(path);

		//	CAN'T USE null or without type or empty!
//		var unkown;
	
		
		var list = List.of("one", "two", "three", "four");
		for (var element: list) {
		    System.out.println(element);
		}

		try (var stream2 = Files.newInputStream(path)) {
		    // process the file
		}



	}

}
