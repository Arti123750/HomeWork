package com.homework.practiseprog;

import java.util.Scanner;

public class ReverseNumberProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,rev = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		no=sc.nextInt();
		while(no!=0)
		{
			rev=rev*10;
			rev=rev+no%10;
			no=no/10;
			
		}
		System.out.println("REVERSE NO IS: "+rev);
		}
}   