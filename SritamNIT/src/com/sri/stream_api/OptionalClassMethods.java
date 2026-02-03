package com.sri.stream_api;

import java.util.Optional;

public class OptionalClassMethods {
  void main() {
	  String str = null;
	  Optional<String> opt = Optional.ofNullable(str);
	  IO.println(opt.orElse("no value"));
	  if(opt.isPresent()) {
		  IO.println("Value in the container : "+opt.get());
	  }
	  else {
		  IO.println("No value in the container");
	  }
  }
} 
