package com.sri.stream_api;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalClassMethods2 {
  void main() {
	  ArrayList<Optional<String>> list = new ArrayList<>();
	  list.add(Optional.of("pune"));
	  list.add(Optional.of("hyd"));
	  list.add(Optional.of("bls"));
	  list.add(Optional.of("kolkata"));
	  list.add(Optional.empty()); // instead of null use this for an empty list
	  
	  for(Optional<String> opt : list) {
		  if(opt.isPresent()) {
			  IO.println("values are: "+opt.get());
		  }
		  else {
			  IO.println("no values");
		  }
	  }
  }
}
