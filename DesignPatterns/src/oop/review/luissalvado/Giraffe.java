package oop.review.luissalvado;

public class Giraffe extends Creature {

	private String name;
	
	@Override
	public void setName(String name) {
		this.name = name;	
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSound(String sound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return null;
	}

}
