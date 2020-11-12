import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String,Integer> myMap=new HashMap<String,Integer>();
		myMap.put("Prat", 1);
		myMap.put("Hi", 2);
		myMap.put("han", 3);
		
		Set s1=myMap.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			
			Map.Entry m1=(Map.Entry)itr.next();
			
			System.out.println( m1.getKey() + "--->" + m1.getValue());
		} 
		
	/*	List <String> words=new ArrayList<String>();
		words.add("Prathik wew");
		
		Map <String,Integer> counts=new HashMap<String,Integer>();
		for(String word : words) {
			word=word.toLowerCase();
			if(!counts.containsKey(word))
			{
				counts.put(word, 1);
				
			}
			else {
				counts.put(word, counts.get(word)+1);
			}
			System.out.println(counts);
		}*/
		
		
	}}


