package oop.review.luissalvado;

abstract public class Creature {
	
	protected String name;
	protected double weight;
	protected String sound;
	
	public abstract void setName(String name);
	public abstract String getName();
	
	public abstract void setWeight(double weight);
	public abstract double getWeight();
	
	public abstract void setSound(String sound);
	public abstract String getSound();
}
