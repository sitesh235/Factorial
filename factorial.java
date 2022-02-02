package javaTime;

import java.util.Scanner;

public class factorial {
	static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factorial of the given number is "+fact(n));
		

	}

}
