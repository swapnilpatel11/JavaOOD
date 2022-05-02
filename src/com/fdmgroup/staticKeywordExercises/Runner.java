package com.fdmgroup.staticKeywordExercises;

public class Runner {
	public static void main(String[] args) {
		System.out.println(EnergyMatterCalculator.matterToEnergy(20));
		System.out.println(EnergyMatterCalculator.energyToMatter(500));
		
		Employee.setMinimumWage(10);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setHourlyWage(9);
		e2.setHourlyWage(9.5);
		e3.setHourlyWage(15);
		
		System.out.println(e1.getHourlyWage());
		System.out.println(e2.getHourlyWage());
		System.out.println(e3.getHourlyWage());
		
	}

}
