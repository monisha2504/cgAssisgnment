package Lab1;

import java.util.Scanner;

public class Cube {
        public static void main(String[]args) {
        	Scanner sc = new Scanner(System.in);
        	int sum=0;
        	int n=0;
        	int a=sc.nextInt();
        while(a>0)
        {
        	n=a%10;
        	sum=sum+n*n*n;
        	a=a/10;
        }
        
        System.out.println(sum);
        sc.close();
        }
      

}
