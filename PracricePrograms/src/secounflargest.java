
public class secounflargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
		
		public static int m1() {
		int a[]= {34,54,1,55,667,100,8};
		int temp;
		int total =a.length;
		for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  

	}
            System.out.println(a[i]);
        }
System.out.println(a[total-2]);

       
		return a[total-2];}}
