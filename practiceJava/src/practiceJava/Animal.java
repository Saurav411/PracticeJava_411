package practiceJava;

public abstract class Animal {
	 int age;;
	 String gender;
	  int weightinLbs;
	  
	   public Animal(int age, String gender, int weightinLbs) {
		this.age = age;
		this.gender = gender;
		this.weightinLbs = weightinLbs;
	}

	public void eat()
	   {
		   System.out.println("eating");
	   }
	   
	   public void sleep()
	   {
		   System.out.println("Sleeping");
	   }
	   
	   public abstract void move();
}


