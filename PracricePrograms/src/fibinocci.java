
public class fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,sum=0;
		String temp="";
		System.out.println((n1 +","+ n2 + ","));
		for(int i=1;i<=5;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			temp=temp+sum+",";
			
		}
		System.out.println(temp);
	}

}
