package Collections;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
	Map<Integer, Integer> getsSquares(int[] arr){
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i:arr)
		{
			map.put(i,i*i);
		}
		
		
		return map;
		
	}
public static void main(String[] args) {
	Ex3 e=new Ex3();
	int[] arr= {1,2,3,4,5};
   System.out.println(e.getsSquares(arr));
	
}
}
