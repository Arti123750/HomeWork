package com.homework.practiseprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SecondWay_To_IteratingMap {

	public static void main(String[] args) {
		Map<String, Integer>m1=new HashMap<String, Integer>();
		
		m1.put("One", 10);
		m1.put("Two", 20);
		m1.put("Three", 30);
		m1.put("Four", 40);
		
		Iterator<Integer>itr=m1.values().iterator();

		for(String name:m1.keySet()){
			
			System.out.println("Key Set: "+name);
			
		}
		
	}
} 