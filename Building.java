package elevatorAy;

import java.util.Scanner;

/**
 * The Building class implements a simple elevator
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
	 * @param num
	 *            the number of floors
	 * @param num2
	 *            the number of customers
	 */
	public Building(int num, int num2) {
		num = numOfFloors;
		num2 = numberOfCustomers;
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
				System.out.println("Incorrect input! Must be integer value. Please try again");
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
				System.out.println("Incorrect input! Must be integer value. Please try again");
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
	 * @return numOfFloors
	 */
	public static int getNumOfFloors() {
		return numOfFloors;
	}

	/**
	 * Accessor method for the number of customers
	 * 
	 * @return numOfCustomers
	 */
	public static int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	/**
	 * Checks if input is an integer
	 * 
	 * @param s
	 * @return true
	 */
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Incorrect input! Must be integer value. Please try again");
		}
		return true;
	}

}
