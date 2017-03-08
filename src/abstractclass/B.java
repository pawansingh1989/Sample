package abstractclass;

public class B extends A{
	
	public void getA(){
		System.out.println("got A");
	}
	public void putA(){
		System.out.println("got B");
	}
	public static void main(String args[]){
		B b=new B();
		b.getA();
		b.putA();
	}

}
