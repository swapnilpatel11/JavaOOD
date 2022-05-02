package com.fdmgroup.classesAndObjectsExercises;

public class Memory {
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;
	
	public Memory(String MODEL, double CAPACITY,double SPEED) {
		super();
		this.MODEL = MODEL;
		this.CAPACITY = CAPACITY;
		usedSpace = 0;
		this.SPEED = SPEED;
	}
	
	public void storeData(String data) {
		System.out.println("storeData has "+data);
	}

	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getCAPACITY() {
		return CAPACITY;
	}

	public double getSPEED() {
		return SPEED;
	}
	
	
	
	

}
