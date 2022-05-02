package com.fdmgroup.dependenciesExercises;

public class HardDrive {
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	
	public HardDrive(String MODEL, double CAPACITY) {
		super();
		this.MODEL = MODEL;
		this.CAPACITY = CAPACITY;
		usedSpace = 0;
	}
	
	public String readData(String file) {
		return "data from" + file;
	}
	
	public void writeData(String data,String file) {
		System.out.println("writeData method has "+data+"and "+file);
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
	
	
	
}
