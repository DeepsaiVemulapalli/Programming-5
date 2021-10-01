package com.info.grillmachine;

public class GrillClient {
	public static void main(String[] args) {
		
	// State pattern to cook grill Chicken 	
		GrillMachine grillMachine = new GrillMachine();

		grillMachine.machineOn();
		grillMachine.cookChicken(10);
		grillMachine.serveChicken(5);
		grillMachine.machineOff();
	}

}
