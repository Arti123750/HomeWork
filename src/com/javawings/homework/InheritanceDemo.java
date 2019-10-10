package com.javawings.homework;
class Dady
{
void daddy()
{
	System.out.println("Calling from Daddy Class");
}
}
class Son extends Dady
{
	void son()
	{
		System.out.println("Calling From Son class");
	}

}



public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dady s1=new Son();
		s1.daddy();

	}

}
