package interfaces;

public class C implements A,B{
	
	public void getA(){
		System.out.println("got A");
	}
	public void getB(){
		System.out.println("got B");
	}
public static void main(String args[]){
	C c=new C();
	c.getA();
	c.getB();
}
}
