package com.fdmgroup.classesAndObjectsExercises;

public class Runner {

	public static void main(String[] args) {
		
		HardDrive drive1 = new HardDrive("Seagate",2048);
		HardDrive drive2 = new HardDrive("Dell",3072);
		drive2.setUsedSpace(500);
		System.out.println(drive1.getMODEL());
		System.out.println(drive1.getCAPACITY());
		System.out.println(drive1.getUsedSpace());
		
		
		Processor processor1 = new Processor("Intel Xeon",2.93,6);
		System.out.println(processor1.getMODEL());
		
		Memory memory1 = new Memory("Kingston",4048,1600);
		memory1.setUsedSpace(500);
		System.out.println(memory1.getCAPACITY());
		

	}

}
