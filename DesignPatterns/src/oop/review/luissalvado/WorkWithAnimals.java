package oop.review.luissalvado;

public class WorkWithAnimals {

	public static void main(String[] args) {
		
		Dog bobby = new Dog();
		
		bobby.setName("Bobby");
		System.out.println(bobby.getName());
		
		bobby.digHole();
		
		bobby.setWeight(-1);
		
		int randNum = 10; 		
		bobby.changeVar(randNum);
		System.out.println("randNum after method call: " + randNum);
		
		changeObjectName(bobby);
		System.out.println("Dog name after method call: " + bobby.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound() +
						   "\nKitty says: " + kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says: " + animals[0].getSound() +
				   "\nKitty says: " + animals[1].getSound());
		
		speakAnimal(doggy);
		
		((Dog) doggy).digHole();
		
		Giraffe girrafe =  new Giraffe();
		girrafe.setName("BigG");
		System.out.println("Giraffe name: " + girrafe.getName());
		
		Monkey monkey =  new Monkey();
		monkey.setName("MM");
		System.out.println("Monkey name: " + monkey.getName());
			
	}

	public static void changeObjectName(Dog dog) {
		dog.setName("Max");
	}
	
	
	public static void speakAnimal(Animal animal) {
		System.out.println("Animal says: " + animal.getSound());
		
	}

}
