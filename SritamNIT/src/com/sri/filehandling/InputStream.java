package com.sri.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
  void main() {
	  try {
		  String path = "c:\\new\\Hello.txt";
		  FileInputStream fin = new FileInputStream(path);
	  try(fin) {
		  int i;
		  while(true) {
			  i=fin.read();
			  if(i==-1) {
				  break;
			  }
			  IO.print((char)i);
		  }
	  }
	  catch(IOException e) {
		  IO.println(e.getMessage());
	  }
	  }
	  catch(FileNotFoundException e) {
		  IO.println(e.getMessage());
	  }
  }
}
