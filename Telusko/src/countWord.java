
public class countWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "pratiek";
		int count =0;
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)!=' ') { //if(str.charAt(i)=' ' && (str.charAt(i+1)!=' ')
				count++;
			}
		}
		System.out.println(count);
	}

}
