
public class singleTon {
	
	public static singleTon obj;
	String str;
	
	private singleTon() {
		str="hi prathik";
	}
	
	public static singleTon getInstance() {
		if(obj==null)
			obj=new singleTon();
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleTon x= obj.getInstance();
		singleTon y = obj.getInstance();
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);

	}

}
