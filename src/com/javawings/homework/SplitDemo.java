package com.javawings.homework;

import java.util.Iterator;
import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		String text = "Apple2xMicrosoft3xGoog8le";
	    // Pattern for delimiter
		String patternString = "is";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		String[] myStrings = pattern.split(text);
		for(String temp: myStrings){
		    System.out.println(temp);
		}
		System.out.println("Number of split strings: "+myStrings.length);
	}}
