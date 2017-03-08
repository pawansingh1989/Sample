package overriding;

public class Subclass extends Superclass{

	int num;
	Subclass(int num){
		this.num=num;
	}
	
	public void value(){
		System.out.println("value of num in subclass is"+num);
		System.out.println("value of num in superclass is"+super.num);
	}
	public static void main(String[] args) {
		
		Subclass s=new Subclass(2);
		s.value();

	}

}
