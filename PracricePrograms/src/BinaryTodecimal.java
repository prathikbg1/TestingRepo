
public class BinaryTodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num =10011011;
	double deci=	convertBinaryToDecimal(num);
	System.out.println(deci);

	}
	public static  double convertBinaryToDecimal(long num) {
		long remainder;
		double decimalNo=0;
		int i=0;
		while(num!=0) {
			remainder = num%10;
			num =num/10;
			decimalNo = decimalNo + (remainder * Math.pow(2,i));
			i++;
		}
		return decimalNo;
			
		}
	}

