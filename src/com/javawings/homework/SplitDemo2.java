package com.javawings.homework;

public class SplitDemo2 {

	public static void main(String[] args) {
		String s1="Apple2xMicrosoft3xGoog8le";
		char[]s2=s1.toCharArray();
		for (char c : s2) {
			
			if(!Character.isDigit(c))
			{
				System.out.print(c);
			}
			
		}
	}

}
