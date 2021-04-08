package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ex4 {
	HashMap<Integer, Integer> getStudents(HashMap<Integer, Integer> map )
	{
		for(Entry<Integer, Integer> en:map.entrySet())
		{
			if(en.getValue()>=90)
			{
				System.out.println("Gold");
			}
			else if(en.getValue()>=80 && en.getValue()<90 )
			{
				System.out.println("Silver");
			}
			else if(en.getValue()>=70 && en.getValue()<80)
			{
				System.out.println("Bronze");
			}
		}
			
		
		return map;
		
		
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer>hs=new HashMap<Integer, Integer>();
		hs.put(101, 95);
		hs.put(102, 87);
		hs.put(103, 60);
		hs.put(104, 75);
		hs.put(105, 100);
		Ex4 e=new Ex4();
		System.out.println(e.getStudents(hs));
	}

}
