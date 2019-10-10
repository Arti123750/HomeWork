package com.homework.practiseprog;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		String s,rev=" ";
		int i;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		s=sc.next();
		for (i = s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			}
		System.out.println("Your reverse String is: "+rev);
	
		
		
		

	}

}
