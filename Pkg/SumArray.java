package Pkg;

public class SumArray {
	void sum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		sum=sum+arr[i];	
		}
		System.out.println(sum);
	}
	void Max(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	void min(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0]>arr[i])
			{
				arr[0]=arr[i];
			}
			}
		System.out.println(arr[0]);
	}
	public static void main(String[]args) {
		int[] arr= {10,20,30,40,50,60};
		SumArray sa=new SumArray();
		sa.sum(arr);
		sa.Max(arr);
		sa.min(arr);
		
	}
		
	}


