package Exceptionalhandling;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try {
		if(a>3000)
		{
			throw new EmployeeException("Error Message");
		}
		else {
			System.out.println("valid");
		}
	}
  catch(EmployeeException e)
		{
	   e.printStackTrace();
	   System.out.println(e.getMessage());
	  
		}
}
}
