package practiceJava;

public class Sparow extends Bird implements Flyable {

	public Sparow(int age, String gender, int weightinLbs) {
		super(age, gender, weightinLbs);
		// TODO Auto-generated constructor stub
	}

	@Override  // as it is implementing an interface, it is mandatory here to define fly() method
	public void fly() {
		System.out.println("Sparrow is flying....");
		
	}

}
