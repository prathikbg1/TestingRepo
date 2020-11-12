
public class wordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "HI PRATIEK";
		String s2="";
		
		/*for(int i=word.length()-1;i>=0;i--) {
			s2=s2+word.charAt(i);
		}
		System.out.println(s2);*/
		
		
		String [] str2=str1.split(" ");
		
		for(String w : str2) {
			
		String revWord="";
		
		for(int i=w.length()-1;i>=0;i--) {
			
			revWord=revWord+w.charAt(i);
		}
		s2=s2+revWord+" ";

	}
		System.out.println(s2);

}}
