package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter temp here:");
	String tempF = scanner.nextLine();
	
	int temp = Integer.parseInt(tempF);
	
	System.out.println("Is the temp Farenheit (F) or Celsius (C)?");
	String tempKind = scanner.nextLine();
	System.out.println(determineTemp(temp, tempKind));
	}
	public static String determineTemp(int temp, String tempKind)
	{
		String temperature;
		int tempC = (int) ((temp - 32)/ 1.8);
		int tempF = (int) (temp * 1.8 + 32);
		
		if(tempKind.toUpperCase().startsWith("F"))
		{
				return temp + "F is " + tempC + "C";
		}
		else 
		{
			return temp + "C is " + tempF + "F";
		}
	}
}
