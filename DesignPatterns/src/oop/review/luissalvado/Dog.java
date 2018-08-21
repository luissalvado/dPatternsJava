package oop.review.luissalvado;

public class Dog extends Animal {
	
	public Dog(){
		super();
		setSound("Bark");
	}
	
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("randNum in method: " + randNum);
	}

}
