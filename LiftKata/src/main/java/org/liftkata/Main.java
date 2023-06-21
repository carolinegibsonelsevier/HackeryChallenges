package org.liftkata;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the lift building");
		CallButton.pressButton();
		LiftController floor = new LiftController();
		floor.starterFloor();
	}
}

