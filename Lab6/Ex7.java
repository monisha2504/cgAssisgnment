package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex7 {
	static int[] getSorted(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{

		arr[i]=reverse(arr[i]);
		}
		Arrays.sort(arr);
		return arr;
	
		
	}
	private static int reverse(int n) {
		int reverse=0;
		  while(n != 0)
		    {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n = n/10;
		    }
		return reverse;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[]arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int[]arr1=getSorted(arr);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
