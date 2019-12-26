package com;

import java.util.Scanner;

public class Switch 
{
	public static void main (String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter the Starting point of String");
		s = sc.next();
		
		switch(s)
		{
		case "S": System.out.println("Sunday");
		break;
		case "M" : System.out.println("Monday");
		break;
		case "T": System.out.println("Tuesday");
		break;
		case "W": System.out.println("Wednesday");
		break;
		case "Th": System.out.println("Thrusday");
		break;
		case "F": System.out.println("Friday");
		break;
		case "Sa": System.out.println("Saturday");
		break;
		
		}
		System.out.println("Do u want to print again starting point of character [YES/NO]");
		String  a = sc.next();
		if(a.equalsIgnoreCase("NO"))
		{
			System.out.println("Thank You!!!");
			break;
			
			
		}
		else
		{
			System.out.println("Please enter again");
			
		}
		
	}

}
}
