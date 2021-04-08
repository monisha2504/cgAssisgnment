package Collections;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
	 Map<Character, Integer> countchars(char[]arr){
		 int count=0;
		 HashMap<Character, Integer> m=new HashMap<Character, Integer>();
		 for(int i=0;i<arr.length;i++) {
			 if(m.containsKey(arr[i]))
			 {
				count =m.get(arr[i]);
				count+=1;
				m.put(arr[i], count);
			 }
			 else {
				 m.put(arr[i], 1);
			 }
			 
			 
		 }
		 
		return m;

	 	}
	 public static void main(String[] args) {
		
	Ex2 e=new Ex2();
	System.out.println(e.countchars("aadhiraiyan".toCharArray()));
		
			
	}
}
