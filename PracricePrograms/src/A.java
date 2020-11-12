
public interface A {
	
	public void m1();

}

class B implements A {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Complete");
		
	}
	
}

class C extends B {
	public static void main(String args[]) {
	
		C c1=new C();
		c1.m1();

	}
}
