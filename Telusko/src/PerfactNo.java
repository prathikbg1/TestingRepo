import java.util.Scanner;

public class PerfactNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=n;
		int divider;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				divider=i;
				sum=sum+divider;
			}
		}
		if(n1==sum) {
			System.out.println("perfact number");
		}

	}

}
