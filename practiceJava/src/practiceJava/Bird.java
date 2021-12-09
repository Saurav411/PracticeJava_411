package practiceJava;

public class Bird extends Animal  {

	public Bird(int age, String gender, int weightinLbs) {
		super(age, gender, weightinLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Birds has wings....");
		
	}
	
	
	
}
