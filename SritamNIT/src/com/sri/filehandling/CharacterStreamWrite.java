package com.sri.filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamWrite {
  void main() {
	  String filePath = "c:\\new\\Hello.txt";
	  try {
	  FileWriter fout = new FileWriter(filePath);// throws filenotfoundexception
	  try (fout){	 
	  String data="hello";	  
	  fout.write(data);// throws IOException
	  IO.println("data stored in file successfully");
	  }
	  catch(FileNotFoundException e) {
		  IO.println(e.getMessage());
	  }
	  }
	  catch(IOException e) {
		  IO.println(e.getMessage());
	  }
  }
}
