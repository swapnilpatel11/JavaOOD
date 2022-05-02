package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class ComputerStore {
	private String name;
	private ArrayList<Computer> computers;
	public ComputerStore(String name) {
		super();
		this.name = name;
		this.computers= new ArrayList<Computer>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public ArrayList<Computer> getAllComputers() {
		return computers;
	}
	
	
	
	
}
