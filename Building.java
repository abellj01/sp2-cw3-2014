package elevatorAy;

import java.util.Scanner;

/**
 * The Building class implements a simple elevator with given number of
 * customers and floors. <code>Main</code> simulates the running of the
 * elevator.
 * 
 * @author Nazia Ayeni and Aymar Bell Jr.
 * @version SP2 CWK3 2014
 */
public class Building {
	private static int numOfFloors, numberOfCustomers;
	private static boolean validInput1, validInput2 = false;

	/**
	 * Creates a building with a number of floors and customers
	 * 
	 * @param floor
	 *            Used for <code>numOfFloors</code>
	 * @param customer
	 *            Used for <code>numberOfCustomers</code>
	 */
	public Building(int floor, int customer) {
		floor = numOfFloors;
		customer = numberOfCustomers;
	}

	/**
	 * The program main method takes user inputs to set the number of floors in
	 * the building and number of customers. The method checks for valid input,
	 * or prompt the user otherwise.
	 */
	public static void main(String[] args) {
		System.out.println("Please enter the number of floors in the building");
		Scanner in = new Scanner(System.in);
		while (!validInput1) {
			String inputOne = in.nextLine();
			if ((isInteger(inputOne) && !(Integer.parseInt(inputOne) <= 0))) {
				numOfFloors = Integer.parseInt(inputOne);
				validInput1 = true;
			} else {
				System.out
						.println("Incorrect input! Must be integer value. Please try again");
				System.out
						.println("Please enter the number of floors in the building");
			}
		}
		System.out
				.println("Please enter the number of customers in the building");

		while (!validInput2) {
			String inputTwo = in.nextLine();
			if ((isInteger(inputTwo) && !(Integer.parseInt(inputTwo) <= 0))) {
				numberOfCustomers = Integer.parseInt(inputTwo);
				validInput2 = true;
			} else {
				System.out
						.println("Incorrect input! Must be integer value. Please try again");
				System.out
						.println("Please enter the number of customers in the building");
			}
		}

		// close scanner
		in.close();

		/**
		 * Creates a new instance of building from user inputs and a new
		 * elevator for the building.
		 */
		new Building(numOfFloors, numberOfCustomers);
		new Elevator();
	}

	/**
	 * Accessor method for the number of floors
	 * 
	 * @return <code>int numOfFloors</code>
	 */
	public static int getNumOfFloors() {
		return numOfFloors;
	}

	/**
	 * Accessor method for the number of customers
	 * 
	 * @return <code>int numberOfCustomers</code>
	 */
	public static int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	/**
	 * Sets the number of floors in the building
	 * 
	 * @param num
	 *            assigned to <code>numOfFloors</code>
	 */
	public static void setNumOfFloors(int num) {
		numOfFloors = num;
	}

	/**
	 * Sets the number of customers in the building
	 * 
	 * @param num
	 *            assigned to <code>numberOfCustomers</code>
	 */
	public static void setNumberOfCustomers(int num) {
		numberOfCustomers = num;
	}

	/**
	 * Checks if String <code>s</code> can be parsed as an integer
	 * 
	 * @param s
	 * @throws NumberFormatException
	 *             if cannot be parsed.
	 * @return boolean
	 */
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out
					.println("Incorrect input! Must be integer value. Please try again");
		}
		return true;
	}

}
