package com.javawings.homework;

class College 
{
static int COLLEGE_ID=101;
static String COLLEGE_NAME="SANJIVANI COLLEGE OF ENGINEERING";
private int countOfStaff;
private String depName;
public int getCountOfStaff() {
	return countOfStaff;
}
public void setCountOfStaff(int countOfStaff) {
	this.countOfStaff = countOfStaff;
}
public String getDepName() {
	return depName;
}
public void setDepName(String depName) {
	this.depName = depName;
}
}
public class EncapsulationDemo {
     public static void main(String[] args) {
		// TODO Auto-generated method stub

		College c1=new College();
		System.out.println("College Id: "+College.COLLEGE_ID);
		System.out.println("College Name: "+College.COLLEGE_NAME);
		
		c1.setCountOfStaff(6);
		c1.setDepName("Mechanical");
		System.out.println("Count Of Staff: "+c1.getCountOfStaff());
		System.out.println("Dept Name: "+ c1.getDepName());
		}
	}
