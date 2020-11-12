import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String s1="silent";
		String s2="listen";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String s3= new String(ch1);
		String s4= new String(ch2);
		
		if(s3.equals(s4)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}*/
		
		//----------------------------------------------------------
		ArrayList al=new ArrayList();
		al.add(2);
		al.add(4);
		al.add(8);
		al.add(19);
		System.out.println("Before swapping"+al);
		Collections.swap(al, 2, 3);
		System.out.println("After swapping"+al);
		

	}

}
