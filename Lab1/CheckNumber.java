package Lab1;
import java.util.Scanner;
public class CheckNumber {
		Boolean checkNumber(int n)
		{
			if(n%2==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
		CheckNumber cn=new CheckNumber();
			System.out.println(cn.checkNumber(n));
		}

	}


