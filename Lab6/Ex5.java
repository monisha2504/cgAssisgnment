package Collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
	static int getSecondSmallest(int[] arr)
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(list.get(1));
		return 0;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[]arr=new int[num];
        for(int i=0;i<num;i++)
        {
        	arr[i]=sc.nextInt();
        }
		getSecondSmallest(arr);

}
}
