import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 /*	for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print(j);
				}
			}
			System.out.println();
		} */
		
		//-----------------floyd trianle------------
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range");
		int x=sc.nextInt();
		int p=1;
		for(int i=1;i<=x;i++){
			for(int j=1;j<=i;j++){
				System.out.print(p);
				p++;
			}
			System.out.println();
		}

	}

}


