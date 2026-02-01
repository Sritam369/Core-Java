package com.sri.stream_api;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ConvertingArraysToStream {
    void main() {
    	String []fruits = {"Orange","Grapes", "apple","Mango"};
    	Stream<String> stream = Arrays.stream(fruits);
    	stream.forEach(IO::println);
    	IO.println("==================");
    	
    	int []numbers = {12,20,25,30};
    	IntStream intStream = Arrays.stream(numbers);
    	intStream.forEach(IO::println);
    	IO.println("==================");
    	
    	long []num = {12L,20L,25L,30L};
    	LongStream longStream = Arrays.stream(num);
    	longStream.forEach(IO::println);
    	IO.println("==================");
    	
    	double []nums = {12.0,25.0,18.0};
    	DoubleStream doubleStream = Arrays.stream(nums);
    	doubleStream.forEach(IO::println);
    	IO.println("==================");
    }
}
