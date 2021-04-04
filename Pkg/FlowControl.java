package Pkg;

public class FlowControl {
	void oval(char[]arr)
	{
		int count =0,count1=0;
		for (int i=0;i<arr.length;i++)
		{
			char c=arr[i];
			switch(c) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;
			default :
				count1++;
				
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

	public static void main(String[] args) {
		char[] arr= {'a','e','i','o','u'};
		FlowControl fd=new FlowControl();
		fd.oval(arr);

	}

}
