package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
	int getsorted(int arr[])
	{
		String str=" ";
		int j=0;
		int arr1[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			arr1[j]=arr[i];
			j++;
		}
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			str+=arr1[i];
		}
		return Integer.parseInt(str);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		Ex3 e=new Ex3();
		System.out.println(e.getsorted(arr));
	}

}
 