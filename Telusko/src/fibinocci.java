
public class fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,k=0;
		
		System.out.print(a + " " + b + " " );
		
		while(k<=10) {
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
		}

	}

}
