package inheritance;

public class Superclass {
	   int age;

	   Superclass(int age) {
	      this.age = age; 		 
	   }

	   public void getAge() {
	      System.out.println("The value of the variable named age in super class is: " +age);
	   }
	}

	 class Subclass extends Superclass {
	   Subclass(int age) {
	      super(age);
	   }

	   public static void main(String argd[]) {
	      Subclass s = new Subclass(23);
	      s.getAge();
	   }
	}
