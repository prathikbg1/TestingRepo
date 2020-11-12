
public class uncommon_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={2,1,3,4,6,7,9};
		int arr2[]={6,1,0,14,26,7,9};
		
		for(int i=0;i<arr1.length;i++){
			boolean flag=false;
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
				flag=true;
				break;
			}
				}
			if(!flag) {
				System.out.println(arr1[i]);
			}
			}
		for(int i=0;i<arr2.length;i++){
			boolean flag=false;
			for(int j=0;j<arr1.length;j++){
				if(arr2[i]==arr1[j]){
				flag=true;
				break;
			}
				}
			if(!flag) {
				System.out.println(arr2[i]);
			}
		}
	}}