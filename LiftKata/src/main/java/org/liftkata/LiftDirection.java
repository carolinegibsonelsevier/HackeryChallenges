package org.liftkata;

public class LiftDirection {
	enum Direction {
		UP, DOWN;
	}

	public static void goingUp() {
		System.out.println(LiftDirection.Direction.UP);
	}

	public static void goingDown() {
		System.out.println(LiftDirection.Direction.DOWN);
	}
}
	/*public void liftGoingUp(currentFloor, desiredFloor) {
		//if direction is up/ desired floor is a greater number than current floor
		if (desiredFloor > currentFloor) {
			System.out.println("Going up");
		}
	}

	public void liftGoingDown() {
		// if direction is down/ desired floor is a lesser number than current floor
		if (desiredFloor < currentFloor) {
			System.out.println("Going down");
		}
	}

	public void sameFloor() {
		// if current floor is the same as destination floor
		if (desiredFloor == currentFloor) {
			System.out.println("We're on the floor you want");
		}
	}*/