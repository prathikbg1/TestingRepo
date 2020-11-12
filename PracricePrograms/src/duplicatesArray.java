import java.util.HashMap;
import java.util.HashSet;

public class duplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a[]= {1,0,44,55,66,55,98,1,101};
		HashSet<Integer> m1= new HashSet<Integer>();
		for(Integer i1 : a) {
			if(m1.add(i1)==false) {
				System.out.println("Duplicates are : " + i1); */
		
		///////////---character--------------------------
		String s="INDIA";
		HashSet<Character> m1= new HashSet<Character>();
		char ch[]=s.toCharArray();
		for ( Character ch1:ch) {
			if(m1.add(ch1)==false) {
				System.out.println("Duplicates are : " + ch1);
			}
		}
			}
		

	}


