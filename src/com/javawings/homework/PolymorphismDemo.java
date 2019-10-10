package com.javawings.homework;

class Class1
{
void m1()
{
System.out.println("Calling from Class1");
}
}
class Class2 extends Class1
{
	void m1() 
	{
		System.out.println("Calling From Class2");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 c1=new Class1();
		Class2 c2=new Class2();
		Class1 c3=new Class2();// method Overriding
		//c3.m1();
		//c1.m1();
		c3.m1();
	}

}
