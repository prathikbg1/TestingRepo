
public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactRecursive f = new FactRecursive();
		int res = f.facttorial(5);
		System.out.println(res);

	}

	public int facttorial(int x) {
		if(x==1) {
			return 1;
		}
		int fact1=facttorial(x-1)*x;
		return fact1;
	}
}
