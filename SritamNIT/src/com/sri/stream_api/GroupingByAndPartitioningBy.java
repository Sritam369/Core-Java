package com.sri.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByAndPartitioningBy {
 public static void main(String[] args) {
	 List<String> list = Arrays.asList("virat","rohit","dhoni");
	Map<Integer,List<String>> map = list.stream().collect(Collectors.groupingBy(n-> n.length()));
	 IO.println(map);
/* grouping by takes function() and it converts stream into Map<k,v>
   the value it returns become the key and the values we supply to groupingby() becomes value of the map*/
	 
	 Map<Boolean,List<String>> map2 = list.stream().collect(Collectors.partitioningBy(n-> n.length()%2==0));
	 IO.println(map2);
	 /* partitioning by takes predicate() and it converts stream into Map<k,v>
	   the value it returns become the key and the values we supply to partitioningby() becomes value of the map*/	 
 }
}
