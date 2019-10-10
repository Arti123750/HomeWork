package com.javawings.homework;
class Student
{
static String COLLEGE_NAME="KBP COLLEGE OF ENGINEERING";
private int rollNo;
private String name;
private String address;

public  int getRollNo()
{
	return rollNo;
}
public void setRollNo(int rollNo)
{
	this.rollNo=rollNo;
}
public String getName()
{
return name;	
}
public void setName(String name)
{
	this.name=name;
}
public String getAddress()
{
return address;	
}
public void setAddress(String address)
{
	this.address=address;
}
}
public class OneMoreEncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setRollNo(10);
		s1.setName("Arti");
		s1.setAddress("Paithan");
		
		Student s2=new Student();
		s2.setRollNo(20);
		s2.setName("Pooja");
		s2.setAddress("Mumbai");
		
		System.out.println("College name is: "+Student.COLLEGE_NAME+"\n");
		System.out.println("Roll No is: "+s1.getRollNo());
		System.out.println("Name is: "+s1.getName());
		System.out.println("Address is: "+s2.getAddress());
		
		System.out.println("\nRoll No is: "+s2.getRollNo());
		System.out.println("Name is: "+s2.getName());
		System.out.println("Address is: "+s1.getAddress());
	}

}
