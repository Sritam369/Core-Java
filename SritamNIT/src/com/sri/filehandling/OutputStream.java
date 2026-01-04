package com.sri.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

  void main()  {
	  String filePath = "c:\\new\\Hello.txt";
	  try {
	  FileOutputStream fout = new FileOutputStream(filePath);// throws filenotfoundexception
	  try (fout){
	 
	  String data="hello";
	  byte bytes[]=data.getBytes();
	  fout.write(bytes);// throws IOException
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
