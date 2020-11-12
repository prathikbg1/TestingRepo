
public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Prathik &888";
		System.out.println(s.charAt(9));
		System.out.println(s.indexOf("k"));
		System.out.println(s.substring(7));
		
		String s2="prathik";
		String s3="";
		for(int i=s2.length()-1;i>=0;i--) {
			s3=s3+s2.charAt(i);
		}
		System.out.println(s3);

	}

}
