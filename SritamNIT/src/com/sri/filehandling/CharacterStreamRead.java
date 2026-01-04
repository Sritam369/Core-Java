package com.sri.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamRead {
	void main() {
	try {
		  String path = "c:\\new\\Hello.txt";
		  FileReader fin = new FileReader(path);
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
