import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=n;
		int rem=0;
		int sum=0;
		
		while(n>0) {
			rem = n%10;
			n=n/10;
			sum = sum + rem*rem*rem;
		}
		if(sum==n1) {
			System.out.println("armsrong number");
		}
	

	}

}
