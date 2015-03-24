package elevatorAy;

import java.util.Random;

/**
 * The Customer class helps to implement a simple elevator
 * 
 * @author Nazia Ayeni and Aymar Bell Jr.
 * @version SP2 CWK3 2014
 */
public class Customer {
	private static int destinationFloor, randomValue;
	private static int startFloor;

	/**
	 * Constructs a Customer object. Assigns a random start floor and a random
	 * destination floor by calling on <code>setRandom()</code> to generate
	 * numbers and calling on <code>setStartFloor()</code> and
	 * <code>setDestinationFloor</code>.
	 */
	public Customer() {
		setStartFloor(setRandom());
		setDestinationFloor(setRandom());
	}

	/**
	 * Sets the floor the customer is waiting at. It increments by one all
	 * floors above the number 12.
	 * 
	 * @param num
	 *            assigned to <code>startFloor</code>
	 */
	public static void setStartFloor(int num) {
		startFloor = num;
		if (startFloor == 13) {
			startFloor = startFloor + 1;
		}
	}

	/**
	 * Accessor method for the floor the customer is waiting at.
	 * 
	 * @return <code>int startFloor</code>
	 */
	public static int getStartFloor() {
		return startFloor;
	}

	/**
	 * Sets the destination floor. It increments by one all floors above the
	 * number 12.
	 * 
	 * @param num
	 *            assigned to <code>destinationFloor</code>
	 */
	public static void setDestinationFloor(int num) {
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
	 * This method uses the Random class to create a random number that is less
	 * than the number of floors in the building and allocates it to the
	 * destination floors
	 * 
	 * @return <code>int randomValue</code>
	 */
	public int setRandom() {
		Random rand = new Random();
		randomValue = rand.nextInt(Building.getNumOfFloors());
		return randomValue;
	}

}
