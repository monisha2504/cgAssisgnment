package Exceptionalhandling;

import java.util.Scanner;

public class Age {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age:");
			int a=sc.nextInt();
			System.out.println(a);
			try {
			if(a<15) {
				throw new AgeException("Age should be above 15");
				
				}
			
			else {
				System.out.println("valid Age");
			}
			}
			catch(AgeException e)
			{ 
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
	}

}


