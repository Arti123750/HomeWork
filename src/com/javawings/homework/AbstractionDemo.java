package com.javawings.homework;
import java.util.Scanner;
abstract class PrimeNo
{
abstract void calPrimeNo();
}
class ExPrimeNo extends PrimeNo
{
Scanner sc=new Scanner(System.in);
public void calPrimeNo()
{
	int no,i,res=0;
	System.out.println("Enter a No: ");
	no=sc.nextInt();
	for(i=2;i<=no/2;i++)
	{
	res=no%i;
	}
	if(res==0)
	{
	System.out.println("No is not Prime");
	}
	else
	{
		System.out.println("No is Prime");
	}
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		ExPrimeNo p1=new ExPrimeNo();
		
		p1.calPrimeNo();
	

	}

}
