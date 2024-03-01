package com.sun;
import java.util.Scanner;

public class Ex1_BMI {
		
	public static void main(String[] args) {

		double killogram;
		double Centimeter;
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Please inter your height in Centimeter and your weight in killogram");
		  
	    Centimeter = input.nextDouble();
	    killogram = input.nextDouble();
		  
	    double Pounds = KelloToPounds(killogram);
		double Inche = CentiToInche(Centimeter);
		
		 
		double BMI = ((Pounds*703) / (Inche*Inche));
		
		if(BMI >= 15 && BMI < 19)
			System.out.println("BMI is "+ BMI + " and Underrweight");
		
		else if(BMI >= 19 && BMI < 25)
			System.out.println("BMI is "+ BMI + " and Normal");
		
		else if(BMI >= 25 && BMI < 30)
			System.out.println("BMI is "+ BMI + " and Overweight");
	

		input.close();

	}
	
	public static double KelloToPounds(double Kellograms)
	{
		double Pounds;
		Pounds = Kellograms*2.2;
		return Pounds;
	}
	
	public static double CentiToInche(double Centimeter)
	{
		double Inche;
		Inche = Centimeter*0.39;
		return Inche;
	}

}

