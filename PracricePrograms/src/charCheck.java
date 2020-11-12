import java.util.Scanner;

public class charCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chararcter");
		char ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("An alphabet");
		}
		else
		{
			System.out.println("Not1");
		}

	}

}
