package b2_JavaLanguageBasics;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
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

	
	
	public static void main(String[] args) throws IOException {
		
		try {
			Path myPath= Path.of("debug.log");
			
					
			var x = Files.exists(myPath, LinkOption.NOFOLLOW_LINKS);
			
			System.out.println("File is "+ (x?"exist":"Not exist"));

			
			if (!x) {
				Files.createFile(myPath);
				
				var y = Files.exists(myPath, LinkOption.NOFOLLOW_LINKS);
				
				System.out.println("File is "+ (y?"exist":"Not exist"));
				
			}
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

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
		
		stream.close();
		stream1.close();


	}
}
