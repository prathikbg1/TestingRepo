
public class reversseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "hello prathik";
	String words [] = s.split(" ");
	String rev ="";
	for(String w : words) {
		String revword ="";
		for(int i=w.length()-1;i>=0;i--) {
			revword = revword + w.charAt(i);
		}
		rev=rev+revword+" ";
	}
System.out.println(rev);
	}

}
