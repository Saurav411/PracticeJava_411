package practiceJava;

public class Fish extends Animal {
	
	public Fish(int age, String gender, int weightinLbs) {
		super(age, gender, weightinLbs);
		// TODO Auto-generated constructor stub
	}

	public void swim()
	{
		System.out.println("Fish can Swim");
	}

	@Override  // Abstract method from Animal class Defined here
	public void move() {
		System.out.println("Fish can easily Swim.........");
		
	}

}
