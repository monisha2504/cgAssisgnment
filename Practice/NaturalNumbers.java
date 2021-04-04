package Practice;

public class NaturalNumbers {
	int CalculateSum() {
		int n=10;
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
			if(i%5==0)
			{
				count=count+i;
			}
			
		}
		System.out.println(count);
		return sum;
		
	}
	public static void main(String[] args) {
		NaturalNumbers cs= new NaturalNumbers();
	    System.out.println(cs.CalculateSum());
	    
	   
	}

}
