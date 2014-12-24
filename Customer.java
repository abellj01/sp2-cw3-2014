package elevatorAy;

import java.util.Random;

/**
 * The Customer class helps to implement a simple elevator
 * 
 * @author Nazia Ayeni and Aymar Bell Jr.
 * @version SP2 CWK3 2014
 */
public class Customer {
	private static final int NUM_OF_FLOORS = Building.getNumOfFloors();
	private static int destinationFloor, randomValue;
	private static int currentFloor = 0;

	/**
	 * Creates an instance of a new customer. Assigns a random destination
	 * floor.
	 */
	public Customer() {
		setDestinationFloor(setRandom());
	}

	/**
	 * Mutator method for the current floor. It increments by one all floors
	 * above the number 12.
	 */
	public static void setCurrentFloor(int num) {
		// As floor 13 does not exist this is increased by one to floor 14.
		currentFloor = num;
		if (currentFloor == 13) {
			currentFloor = currentFloor + 1;
		}
	}

	/**
	 * Accessor method for the current floor
	 * 
	 * @return currentFloor
	 */
	public static int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * Mutator method for the destination floor. It increments by one all floors
	 * above the number 12.
	 */
	public static void setDestinationFloor(int num) {
		// sets destinationFloor to num.
		// As floor 13 does not exist this is increased by one to floor 14.
		destinationFloor = num;
		if (destinationFloor == 13) {
			destinationFloor = destinationFloor + 1;
		}
	}

	/**
	 * Accessor method for the destination floor
	 * 
	 * @return destinationFloor
	 */
	public static int getDestinationFloor() {
		return destinationFloor;
	}

	/**
	 * Accessor method for the number of floors
	 * 
	 * @return NUM_OF_FLOORS
	 */
	public static int getNUM_OF_FLOORS() {
		return NUM_OF_FLOORS;
	}

	/**
	 * This method uses the Random class to create a random number that is less
	 * than the number of floors in the building and allocates it to the
	 * destination floors
	 * 
	 * @return a random value
	 */
	public int setRandom() {
		Random rand = new Random();
		randomValue = rand.nextInt(getNUM_OF_FLOORS());
		return randomValue;
	}

}
