package Exceptionalhandling;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ur firstName:");
		String str= sc.nextLine();	
		System.out.println("Enter ur SecondName");
		String str1=sc.nextLine();
		try {
			if(str.equals("") || str1.equals("") )
			{
				throw new EmpException("First name and Last name is blank");
			}
			else {
				System.out.println("valid");
			}
		}
		catch(EmpException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
