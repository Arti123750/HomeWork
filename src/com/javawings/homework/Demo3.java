package com.javawings.homework;

public class Demo3 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		String s1="Apple2xMicrosoft3xGoog8le";
		//String s2[]=s1.split("\\d");
		String s2[]=s1.split("[a-zA-Z]");
		for (String st12 : s2) {
			
			System.out.print(st12);
		}
	}

}
