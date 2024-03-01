 package com.sun;

import java.util.Scanner;

public class Ex3_PrimeNumber {

	public static void main(String[] args) {
		
		int num2;

		
		for(int i=2 ; i<500 ; i++)
		{
			PrimeNu(i);
		}
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number");
		num2 = input.nextInt();
		
		while(num2 >= 2)
		{
			
		PrimeNu(num2);
		System.out.println("\nEnter an integer number");
		num2 = input.nextInt();
		
		}
		
		if(num2 < 2)
			System.out.println("\nBye Bye !!!");
		

		input.close();

	}
	
	public static void PrimeNu(int i)
	{
		int prime = 0;

			for(int num=2 ; num < 10 ; num++)
			{
				if (i % num == 0 && i != num)
				{
					prime = 0;
					break;
				}
				else
					prime = i;
					
			}
			
			if(prime != 0)
				System.out.println(prime+ " is a prime number");
			else
				System.out.println(i+ " is not a prime number");

	}

}
