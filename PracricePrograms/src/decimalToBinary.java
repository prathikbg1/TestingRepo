
public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num =156;
	long n=	binaryToDecimal(num);
	System.out.println(n);

	}
	
	public static long binaryToDecimal(long num) {
		long remainder=1; int i=1;
		long binary=0;
		
		while(num!=0) {
			remainder=num%2;
			num=num/2;
			binary = binary + (remainder*i);
			i=i*10;
		}
		return binary;
	}

}
