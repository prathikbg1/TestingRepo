import java.util.ArrayList;
import java.util.Iterator;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numCheck();
		
	/*	ArrayList<String> a = new ArrayList<String>();
		a.add("GOT");
		a.add("PB");
		a.add("300");
		
		for (Object a1 : a) {
			System.out.println(a1);
		}
		
		Iterator<String> i1 = a.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next()); */
	}
	public static void numCheck(){
		String s="ahsvdasgvd3452";
		String no = "[^0-9]"; // "[^a-zA-Z0-9]"
		for(int i=0;i<s.length();i++) {
		if(s.matches(no)) {
			System.out.println(s.indexOf(i));
			break;
		}
		else {
			System.out.println("no numbers");
			break;
		}
			}}}
		


