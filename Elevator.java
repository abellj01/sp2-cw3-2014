package elevatorAy;

/**
 * The Elevator class helps to implement a simple elevator
 * 
 * @author Nazia Ayeni and Aymar Bell Jr.
 * @version SP2 CWK3 2014
 */
public class Elevator {
	private static int totalNumOfMoves, customersServed;
	private static String direction;

	/**
	 * Creates an instance of a new elevator and sets number of moves made and
	 * customers served to zero.
	 */
	public Elevator() {

		totalNumOfMoves = 0;
		customersServed = 0;

		/**
		 * The loop runs continually as long as there are still customers left to
		 * serve. It creates a new customer generating a new destination floor.
		 * It calls on direction() and move() methods to reach destination floor,
		 * keeping a record of floors visited and customers served.
		 */
		while (customersServed != Building.getNumberOfCustomers()) {
			new Customer();
			System.out.println("Customer no:" + (customersServed + 1));
			System.out.println("Current floor:" + Customer.getCurrentFloor());
			System.out.println("Destination floor:"
					+ Customer.getDestinationFloor());
			this.direction();
			this.move();
			customersServed = customersServed + 1;
		}

		/**
		 * Once all customers have been served the program prints total number
		 * of moves made and customers served. Then exits the program.
		 */
		System.out.println("The elevator has made " + totalNumOfMoves
				+ " moves.");
		System.out.println("The elevator has served " + customersServed
				+ " customers");
		System.out.println("Thank you for using the elevator. Goodbye");
		System.exit(0);
	}

	/**
	 * This method compares the current floor with destination floor and decides upon the
	 * direction the elevator needs to take. 
	 * It assigns this direction to a variable.
	 */
	public void direction() {
		if ((Customer.getDestinationFloor()) > (Customer.getCurrentFloor())) {
			direction = "up";
			move();
		}
		if ((Customer.getDestinationFloor()) < (Customer.getCurrentFloor())) {
			direction = "down";
			move();
		}
		if (Customer.getDestinationFloor() == Customer.getCurrentFloor()) {
			System.out.println("You have reached destination floor");
		}
	}

	/**
	 * It uses the variable direction to move the elevator up or down one floor.
	 * It keeps record of moves made and updates the currentFloor. 
	 */
	public void move() {
		if (direction == "up") {
			while ((Customer.getCurrentFloor()) != (Customer
					.getDestinationFloor())) {
				Customer.setCurrentFloor(Customer.getCurrentFloor() + 1);
				System.out.println(Customer.getCurrentFloor());
				totalNumOfMoves = totalNumOfMoves + 1;
			}
		}
		if (direction == "down") {
			while ((Customer.getCurrentFloor()) != (Customer
					.getDestinationFloor())) {
				Customer.setCurrentFloor(Customer.getCurrentFloor() - 1);
				System.out.println(Customer.getCurrentFloor());
				totalNumOfMoves = totalNumOfMoves + 1;
			}
		}
	}
}
