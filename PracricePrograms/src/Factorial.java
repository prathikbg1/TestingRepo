import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);
		
	}

}
