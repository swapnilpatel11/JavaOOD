package com.fdmgroup.dependenciesExercises;

public class Processor {
	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;
	
	public Processor(String MODEL, double SPEED, int NUMBER_OF_CORES) {
		super();
		this.MODEL = MODEL;
		this.SPEED = SPEED;
		this.NUMBER_OF_CORES = NUMBER_OF_CORES;
	}
	
	public void processData(String data) {
		System.out.println("Method processData " + data);
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getSPEED() {
		return SPEED;
	}

	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}
	
	
	
	

}
