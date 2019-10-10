package com.homework.practiseprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstWay_To_IteratingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer>m1=new HashMap<String, Integer>();
		
		m1.put("A", 1);
		m1.put("B", 2);
		m1.put("C", 3);
		m1.put("D", 4);
		m1.put("E", 5);
		System.out.println(m1);
		Iterator<String>i1=m1.keySet().iterator();
		while(i1.hasNext()) //Using While loop
		{
			System.out.println(i1.next());
		}
			
	}
} 