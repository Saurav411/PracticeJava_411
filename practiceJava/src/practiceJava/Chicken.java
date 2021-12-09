package practiceJava;

public class Chicken extends Bird {

	public Chicken(int  age, String gender, int weightinLbs) {
		super(age, gender, weightinLbs);
		System.out.println("Chicken is having the age, gender and weight as " + age+gender+weightinLbs);
	}
}
