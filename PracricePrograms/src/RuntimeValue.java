import java.util.Scanner;

public class RuntimeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
