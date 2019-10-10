package com.javawings.homework;

class Super
{
void m1()
{
System.out.println("Blank Method");	
}
void m1(int a)
{
System.out.println("Singel Parameter Method");	
}
void m1(int a,int b)
{
System.out.println("Two Prameter Method");	
}
void m1(int a,int b,int c)
{
	System.out.println("Three Parameter Constructor");
}
}


public class MethodOverloadingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super s1=new Super();
		s1.m1();
	}

}
