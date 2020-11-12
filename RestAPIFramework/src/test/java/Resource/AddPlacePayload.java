package Resource;

import java.util.ArrayList;
import java.util.List;

import Pojo.Addplace;
import Pojo.Location;

public class AddPlacePayload {
	
	public Addplace getAddPlacePayload(String language,String cityName) {
		
		Addplace p = new Addplace();
    	p.setAccuracy(100);
    	p.setLanguage(language);
    	p.setName(cityName);
    	p.setPhone_number("+919217643864");
    	p.setWebsite("www.nammaBangalore.com");
    	p.setAddress("187,Vianayaka nilaya,HSR layout");
    	
    	List<String> mylist = new ArrayList<String>();
    	mylist.add("Jordan");
    	mylist.add("tony");
    	p.setTypes(mylist);
    	
    	Location l = new Location();
    	l.setLat(5.67565);
    	l.setLng(7.98089);
    	p.setLocation(l);
    	
    	return p;
		
	}

}
