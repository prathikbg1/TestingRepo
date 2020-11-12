
public class sumOfNumberRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int num1 =addNum(num);
		System.out.println("sum is : " + num1);
	
	}
		public static int addNum(int num) {

			if(num!=0) {
				return num+ addNum(num-1);
			}
			else {
				return num;
			}
	}

}
