package com.fdmgroup.interfacesExercise;

public class Toy implements BasketItem{
	private int minAge;
	private int maxAge;
	
	public Toy(int minAge, int maxAge) {
		super();
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "getName--toy";
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setPrice(double price) {
		
		
	}
}
