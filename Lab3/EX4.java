package lab3;

import java.util.Scanner;

public class EX4 {
	int modifyNumber(int number) {
		String str="";
		str+=number;
		StringBuffer sb= new StringBuffer();
		if(str.length()%2==0)
		{
			for(int i=0;i<str.length()-1;i++)
			{
				char ch=str.charAt(i);
				char ch1=str.charAt(i+1);
				sb.append(Math.abs((int)ch1-(int)ch));
				
			}
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				char ch1=str.charAt(i+1);
				sb.append(Math.abs((int)ch-(int)ch));
				
			}
			sb.append(str.charAt(str.length()-1));
		}
		String s= sb.toString();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		EX4 e=new EX4();
		System.out.println(e.modifyNumber(number1));
	}

}
