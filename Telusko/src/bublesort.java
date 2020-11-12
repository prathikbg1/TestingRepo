import java.util.Arrays;

public class bublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {34,54,2,45,67,32};
		int n=a.length;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
