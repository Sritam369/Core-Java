package com.sri.exception_handling;

import java.io.Closeable;
import java.io.IOException;

public class TryWithMultipleResources {
   void main()  {
	   FileResources fr = new FileResources();
	   DatabaseResources dr = new DatabaseResources();
	   try(fr;dr){
		   IO.println(10/0);
	   }
	   catch(Exception e) {
		   IO.println(e);
	   }
	   
   }
}

class FileResources implements Closeable{
	public void close() throws IOException{
		IO.println("File resource closed");
	}
}

class DatabaseResources implements AutoCloseable{
	public void close() throws Exception{
		IO.println("Database resource closed");
	}
}