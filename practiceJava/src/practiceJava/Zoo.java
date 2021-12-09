package practiceJava;

public class Zoo {

	public static void main(String[] args) {

		Bird bird1 = new Bird(12, "m", 7);
//		bird1.fly();
		bird1.eat();
		bird1.sleep();
//		bird1.swim();  // Can not call swim() method with Bird Object because Bird class dont know Fish Class
		System.out.println("*******************************************");
		Fish fish1 = new Fish(12, "F", 1);
		fish1.swim();
		fish1.move();
		System.out.println("*******************************************");
		Chicken chick1 = new Chicken(1, "M", 9);
		chick1.eat();
		chick1.sleep();
		chick1.move();
		System.out.println("*******************************************");
		Sparow sprw1 = new Sparow(2, "F", 3);
		sprw1.eat();
		sprw1.sleep();
		sprw1.fly();
		sprw1.move();
		System.out.println("*******************************************");
		
		
//		**************
		Animal fish2 = new Fish(1,"M",2);
		Animal sparow1 = new Sparow(5,"M",6);
		
		moveAnimal(fish2);
		moveAnimal(sparow1);
	}

	public static void moveAnimal(Animal animal)
	{
		animal.move();
	}
}
