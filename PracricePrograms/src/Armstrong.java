
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3712;
		int result=n;
		int rem=0;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=rem*rem*rem+sum;
			n=n/10;
		}
		if(sum==result)
		{
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not");
		}
		
	}

}
