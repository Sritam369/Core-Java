package com.sri.stream_api;

import java.util.Arrays;

public class ConvertBooleanValue {
  void main() {
	  Boolean[] words = {true,false,true,false,true};
	  Object[] arr = Arrays.stream(words).map(n-> n?"Yes":"No").toArray();
	  IO.println(Arrays.toString(arr));
			  
  }
}
