import java.util.Scanner;

public class onetwothree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onetwothree o=new onetwothree();
		o.largeNo();}
		
		public void largeNo() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array size");
			int n=sc.nextInt();
			System.out.println("enter array elemets ");
			int a1[]=new int[n];
			for (int i=0;i<n;i++) {
				
	a1[i]=sc.nextInt();
				}
			int max=0;
			for(int i=0;i<n;i++) {
				if(max<a1[i]) {
					max=a1[i];
				}
			}
		System.out.println(max);
				

		
		}

	}


