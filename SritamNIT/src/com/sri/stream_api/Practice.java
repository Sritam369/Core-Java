package com.sri.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Person6(String name,Integer age,String gender) {
	
}


public class Practice {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		numbers.stream().filter(n->n%2!=0).map(n->n*n).forEach(IO::println);
		
		List<String> str = List.of("apple","banana","orange","grape","pear");
	
		Map<Integer, Long> collect = str.stream().collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));
		collect.forEach((k,v)-> IO.println(k+" "+v));
		
		List<Person6>list = List.of(new Person6("bob",30,"male"),new Person6("charlie",20,"male"),new Person6("david",35,"male"),new Person6("frank",22,"male"),new Person6("alice",25,"female"),new Person6("bob",30,"male"),new Person6("eve",28,"female"),new Person6("grace",26,"female"));
		Map<String,List<Person6>> map = list.stream().collect(Collectors.groupingBy(n-> n.gender()));
		map.forEach((k,v)-> IO.println(k+" "+v));
		

List<Integer> list1 = List.of(1,2,3);
List<Integer> list2 = List.of(2,3,4,5);
List<Integer> list3 = List.of(4,5,6);
List<List<Integer>> list4 = List.of(list1,list2,list3);

list4.stream().flatMap(n->n.stream()).distinct().forEach(IO::println);
	}

}
