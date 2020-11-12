import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int flag=0; //boolean isPrime = true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
			  flag=1;//isPrime =false;
				break;
			}}
		
			if(flag==0) {//if(isPrime) 
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not Prime nnumber");
			}
			
			}
		}

	

