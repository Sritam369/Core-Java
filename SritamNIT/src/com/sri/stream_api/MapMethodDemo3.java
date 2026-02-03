package com.sri.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

record Player(Integer id,String name) {
	
}

public class MapMethodDemo3 {
  void main() {
	  List<Player> list = new ArrayList<>();
	  list.add(new Player(101,"surya"));
	  list.add(new Player(102,"ishan"));
	  list.add(new Player(103,"abhi"));
	  list.add(new Player(104,"tilak"));
	  list.add(new Player(102,"ishan"));
	  
	  Set<String> set = list.stream().map(player-> player.name().toUpperCase()).collect(Collectors.toSet());
	  IO.println(set);
  }
}
