import java.util.Scanner;

public class Check_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp=num;
		int rem=0;
		boolean isBinary=true;
		while(temp!=0) {
			rem = temp%10;
			if(rem>1) {
				isBinary=false;
				break;
			}
			else {
				temp=temp/10;
			}
		}
		if(isBinary) {
			System.out.println("Binaary");
		}
		else {
			System.out.println("NOT");
		}

	}

}
