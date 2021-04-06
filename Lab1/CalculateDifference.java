package Lab1;

public class CalculateDifference {
	int Square(int n) {
		int squarenum=(n*(n+1)+(2*(n+1)))/6;
		int num1=(n*(n+1))/2;
		int squares=(num1)^2;
		System.out.println(squares);
		int difference=(squarenum-squares);
		return difference;
		
	}
		
		public static void main(String[] args) {
		CalculateDifference cd=new CalculateDifference();
		System.out.println(cd.Square(10));
	}
}


	
