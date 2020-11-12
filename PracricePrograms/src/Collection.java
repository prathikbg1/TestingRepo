import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* List l1=new ArrayList();
		l1.add("Ram");
		l1.add("sham");
		l1.add(10);

		
		for(int i=0;i<l1.size();i++)
		{
		System.out.println(l1.get(i)); 
		}

		for(String l2 : l1) { 
			System.out.println(l2); 
		}  
		
		Iterator i1= l1.iterator();
		while (i1.hasNext()) {
			Object l2= i1.next();
		
		System.out.println(l2);} */
		
		Map<String,Integer> m1=new HashMap();
		m1.put("prat", 1);
		m1.put("prat1", 124);
		
		for (Map.Entry<String,Integer> entry : m1.entrySet()) { 
	         System.out.println(entry.getKey() + " = " + entry.getValue()); 
	      } 
	}

}
