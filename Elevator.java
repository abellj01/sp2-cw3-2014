package elevatorAy;

/**
 * The Elevator class helps to implement a simple elevator
 * 
 * @author Nazia Ayeni and Aymar Bell Jr.
 * @version SP2 CWK3 2014
 */
public class Elevator {
	private static int totalNumOfMoves, customersServed;
	private static int currentFloor = 0;
	private static String direction;
	private static Boolean isEmpty = true;

	/**
	 * Creates an instance of a new elevator and sets number of moves made and
	 * customers served to zero.
	 */
	public Elevator() {

		totalNumOfMoves = 0;
		customersServed = 0;

		/**
		 * The loop runs continually as long as there are still customers left
		 * to serve. It creates a new customer generating a new destination
		 * floor. It calls on direction() and move() methods to reach
		 * destination floor, keeping a record of floors visited and customers
		 * served.
		 */
		while (customersServed != Building.getNumberOfCustomers()) {
			new Customer();
			System.out.println("Customer no:" + (customersServed + 1));
			System.out.println("Customer start floor:"
					+ Customer.getStartFloor());
			System.out.println("Current floor:" + currentFloor);
			System.out.println("Destination floor:"
					+ Customer.getDestinationFloor());
			// Move elevator to customer start floor to pick up customer
			while (isEmpty) {
				pickUpCustomer();
			}
			// Move elevator with customer to destination floor.
			while (!isEmpty) {
				dropOffCustomer();
			}
			customersServed = customersServed + 1;
			System.out.println();
		}

		/**
		 * Once all customers have been served the program prints total number
		 * of moves made and customers served. Then exits the program.
		 */
		System.out.println("The elevator has visited " + totalNumOfMoves
				+ " floors.");
		System.out.println("The elevator has served " + customersServed
				+ " customers");
		System.out.println("Thank you for using the elevator. Goodbye");
		System.exit(0);
	}

	/**
	 * This method moves the elevator to the start floor the calling customer is
	 * waiting at. It then calls upon the <code>move()</code> method.
	 * <code>direction</code> is used to decide direction elevator is to move
	 * in.
	 */
	public static void pickUpCustomer() {

		if (currentFloor < (Customer.getStartFloor())) {
			direction = "up";
			move();
		} else if (currentFloor > (Customer.getStartFloor())) {
			direction = "down";
			move();
		} else {
			System.out.println("Customer enters lift");
			isEmpty = false;
		}
	}

	/**
	 * This method takes the customer to his destination. It then calls upon the
	 * <code>move()</code> method. <code>direction</code> is used to decide
	 * direction elevator is to move in.
	 */
	public static void dropOffCustomer() {
		//
		if ((Customer.getDestinationFloor()) > currentFloor) {
			direction = "up";
			move();
		} else if ((Customer.getDestinationFloor()) < currentFloor) {
			direction = "down";
			move();
		} else {
			System.out.println("You have reached destination floor");
			System.out.println("Customer exits lift");
			isEmpty = true;
		}
	}

	/**
	 * This method uses the variable <code>direction</code> to move the elevator up or down one
	 * floor. keeps record of moves made and updates the
	 * <code>currentFloor</code> after each call of method.
	 */
	public static void move() {

		if (direction == "up") {
			currentFloor = currentFloor + 1;
			System.out.println("Floor visited: " + currentFloor);
			totalNumOfMoves = totalNumOfMoves + 1;
		}
		if (direction == "down") {
			currentFloor = currentFloor - 1;
			System.out.println("Floor visited: " + currentFloor);
			totalNumOfMoves = totalNumOfMoves + 1;
		}
	}
	
	/**
	 * Returns the current floor the elevator is at.
	 * 
	 * @return <code>int currentFloor</code>
	 */
	public static int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * Sets the current floor in the elevator
	 * 
	 * @param num assigned to <code>currentFloor</code>
	 */
	public static void setCurrentFloor(int num) {
		currentFloor = num;
	}

	/**
	 * Returns the direction the elevator is travelling in.
	 * 
	 * @return <code>String direction</code>
	 */
	public static String getDirection() {
		return direction;
	}

	/**
	 * Sets the direction the elevator should travel in
	 * 
	 * @param s assigned to <code>direction</code>
	 */
	public static void setDirection(String s) {
		direction = s;
	}

}
