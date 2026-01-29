package com.sri.collection_framework;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
  void main() throws Exception {
	  var fin = new FileInputStream("D:\\new\\database.properties");
	  Properties prop = new Properties();
	  prop.load(fin);
	  
	  String driverName = prop.getProperty("driverName");
	  String userName = prop.getProperty("userName");
	  String pwd = prop.getProperty("password");
	  
	  IO.println("Driver name is: "+driverName);
	  IO.println("User name is: "+userName);
	  IO.println("Password name is: "+pwd);
  }
}
