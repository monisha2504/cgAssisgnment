package lab3;

import java.util.Scanner;

public class EX5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		int character=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			character++;
		}
		System.out.println("total number of character"+character);
		String[] s=str.split("\\s+");
		System.out.println("total number of words"+s.length);
	}

}
