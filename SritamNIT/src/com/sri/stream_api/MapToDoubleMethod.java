package com.sri.stream_api;

import java.util.List;

record Prod(Integer id,String name,Double price) {
	
}

public class MapToDoubleMethod {
	public static void main(String[] args) {
  List<Prod> list = List.of(new Prod(101,"mobile",25000d),new Prod(101,"laptop",75000d));
  double sum = list.stream().mapToDouble(n-> n.price()).sum();
  IO.println(sum);
}
}