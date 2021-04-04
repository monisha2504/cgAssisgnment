package Lab1;

public class NonRecurrsion {

	public static void main(String[] args) {
		int n=10;
		int a=1;
		int b=1;
		int c=0;
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
