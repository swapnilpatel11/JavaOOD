package com.fdmgroup.interfacesExercise;

public class Laptop implements BasketItem{
	
	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	
	
	public Laptop(double cpuSpeed, double memory, double hardDrive) {
		super();
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		
	}

}
