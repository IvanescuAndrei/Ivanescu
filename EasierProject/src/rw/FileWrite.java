package rw;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class FileWrite { 
	public void WriteToFile(){
 
		try {
		File file = new File("WrittenFile.txt");
        
		if(!file.exists()) {
				file.createNewFile();	
		}
////////////////		
		Scanner something = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(file);
		pw.println(something.nextLine());
////////////////	
		pw.close();
		something.close();
///////////////		
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}


                                      // ***   Ivanescu Andrei-Alexandru  *** \\