import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=n;
		int rem=0,s=0;
		
		while(n>0) {
			rem = n%10;
			n=n/10;
			s=s*10+rem;
		}
if(n1==s) {
	System.out.println("palindrome");
}
	}

}
