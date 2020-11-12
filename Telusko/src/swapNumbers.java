
public class swapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
	/*	int c=a;
		a=b;
		b=c; 
		
		a=a+b;
		b=a-b;
		a=a-b; */
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		
		System.out.println("a is : " + a);
		System.out.println("b is : " + b);

	}

}
