package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
    List<String> getvalues(HashMap<Integer,String> hs) {
   List<String> a=new ArrayList<>(hs.values());
    	Collections.sort(a);
    	
    return a;	
    }
    public static void main(String[] args) {
    	HashMap<Integer, String> hs = new HashMap<Integer, String>();
    	hs.put(1, "Monisha");
    	hs.put(2, "Kuttythanos");
    	hs.put(3, "Aadhipapa");
    	hs.put(4, "Mithran");
    	hs.put(5, "Tanvik");
    	hs.put(6, "NithilaNachi");
    	Ex1 e=new Ex1();
    	System.out.println(e.getvalues(hs));
	}
}
