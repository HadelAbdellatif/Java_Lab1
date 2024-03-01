package com.sun;

import java.util.Scanner;

public class Ex2_Salary {

	public static void main(String[] args) {
		
		int hoursNo;
		double Rate;
		double Salary;
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Please inter hours worked ( -1 to end )");
	    hoursNo = input.nextInt();
	    
	    while ( hoursNo != -1)
	    {
	    System.out.println("Please inter hourly rate");
	    Rate = input.nextDouble();
	    
	    if(hoursNo <= 40)
	    { 
	       Salary = hoursNo * Rate;
	       System.out.println("Salary is $"+Salary);
	    }
	    
	    else
	    {
	    	double hours = hoursNo - 40;
	    	Salary = ((40 * Rate) + (hours*1.5*Rate));
		    System.out.println("Salary is $"+Salary);
	    }
	    
	    System.out.println("\nPlease inter hours worked ( -1 to end )");
	    hoursNo = input.nextInt();

	}
	    if (hoursNo == -1)
	    	 System.out.println("\nBye Bye !!!");
	    
		input.close();

	}

}
