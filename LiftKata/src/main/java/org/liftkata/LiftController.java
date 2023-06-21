package org.liftkata;

import static org.liftkata.CallButton.currentFloor;
import static org.liftkata.Floors.starterFloor;

import java.util.Scanner;

public class LiftController {

	public void starterFloor() {
		System.out.println("You are on " + starterFloor);
	}
	public void destinationFloor () throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please select the floor you want: ");
		int desiredFloor = scanner.nextInt();

		// Simulate the lift moving to the destination floor
		while (currentFloor > desiredFloor) {
			System.out.println("Currently at floor " + currentFloor);
			currentFloor--;
			Thread.sleep(1000);  // Delay of 1 second between floors
		}
		while (currentFloor < desiredFloor) {
			System.out.println("Currently at floor " + currentFloor);
			currentFloor++;
			Thread.sleep(1000);
		}

		System.out.println("Lift has arrived at floor " + desiredFloor);
		scanner.close();
	}
	public static void doorsOpening () {
		System.out.println("Doors Opening");
	}
	public static void doorsClosing () {
		System.out.println("Doors Closing");
	}
}

/*enum Floors {
	GROUND_FLOOR, FLOOR_1, FLOOR_2,	FLOOR_3, FLOOR_4, FLOOR_5;
}
	Floors ground_floor = Floors.values()[0];
	Floors first_floor = Floors.values()[1];
	Floors second_floor = Floors.values()[2];
	Floors third_floor = Floors.values()[3];
	Floors fourth_floor = Floors.values()[4];
	Floors fifth_floor = Floors.values()[5];
	public void printAllFloors() {
		System.out.println(ground_floor);
		System.out.println(first_floor);
		System.out.println(second_floor);
		System.out.println(third_floor);
		System.out.println(fourth_floor);
		System.out.println(fifth_floor);
	}*/