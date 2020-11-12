
public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hi tony ja";
		String s1="";
		
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ') {
			s1=	s.replaceAll("\\s", "");
			}}
		
		System.out.println(s1);
		
	}

}
