
public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,5,44,1,2,45,66};
		int size = a.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]==a[j]) {
					while(j<size-1) {
						a[j]=a[j+1];
						j++;
					}
					size--;
				}
			}
		}
		for(int k=0;k<size;k++) {
			System.out.println(a[k] + ",");
		}

	}

}
