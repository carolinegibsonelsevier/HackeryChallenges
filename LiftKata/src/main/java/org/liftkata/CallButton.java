package org.liftkata;

import static org.liftkata.Floors.currentFloor;

public class CallButton {
	static boolean isLiftActive;


	public void initalLiftStatus() {
		isLiftActive = false;
	}
	public static void pressButton() {
		System.out.println("Please press call button");
		if (!isLiftActive) {
			System.out.println("Button pressed. Activating lift...");
			isLiftActive = true;
			// Simulate the lift moving to the ground floor
			while (currentFloor > 1) {
				System.out.println("Currently at floor " + currentFloor);
				currentFloor--;
			}
			System.out.println("Lift has arrived at the ground floor.");
			isLiftActive = false;
		} else {
			System.out.println("Lift is already active. Please wait for lift to arrive.");
		}
	}
}
