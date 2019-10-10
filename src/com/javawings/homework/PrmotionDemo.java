package com.javawings.homework;
class Demo
{
void m1(int a)
{
	System.out.println("Int Value");	
}
void m1(Number a)
{
	System.out.println("Number value");
}
/*void m1(float a)
{
	System.out.println("float Value");
}*/
void m1(Object a)
{
	System.out.println("Object Value");
}
/*void m1(Float a)
{
	System.out.println("Float Value");
}*/
void m1(Integer a)
{
	System.out.println("Integer Value");
}
}




public class PrmotionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		d1.m1(10.0f);
	}

}
