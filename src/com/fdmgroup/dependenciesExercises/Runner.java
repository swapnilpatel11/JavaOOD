package com.fdmgroup.dependenciesExercises;

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
		
		Computer computer1 = new Computer("Dell",drive1,memory1,processor1);
		Computer computer2 = new Computer("Lenovo",drive2,memory1,processor1);
		
		PowerSource power = new PowerSource(240);
		computer1.getPower(power);
		
		ComputerStore swapCom = new ComputerStore("Swap");
		swapCom.addComputer(computer1);
		swapCom.addComputer(computer2);
		System.out.println(swapCom.getAllComputers());

	}
}
