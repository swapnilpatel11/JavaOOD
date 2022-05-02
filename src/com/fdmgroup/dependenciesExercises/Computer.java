package com.fdmgroup.dependenciesExercises;

public class Computer {
	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;
	public Computer(String MODEL, HardDrive hardDrive, Memory memory, Processor PROCESSOR) {
		super();
		this.MODEL = MODEL;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.PROCESSOR = PROCESSOR;
	}
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public String getMODEL() {
		return MODEL;
	}
	public Processor getPROCESSOR() {
		return PROCESSOR;
	}
	
	public void turnOn() {
		System.out.println("turnOn -- Computer");
	}
	
	public void turnOff() {
		System.out.println("turnOff--Computer");
	}
	
	public void getPower(PowerSource powerSource) {
		System.out.println(powerSource.supplyPower() + " watts received from powerSource");
	}

	
	
}
