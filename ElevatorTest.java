/**
 * 
 */
package elevatorAy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class includes unit tests to assess functionality of the elevator
 * system.
 * 
 * @author Nazia Ayeni and Aymar Bell Jr.
 * @version SP2 CWK3 2014
 */
public class ElevatorTest {

	@Test
	/** Check new building is created with said floors and customers
	 * @throws IllegalArgumentException
	 */
	public void testBuilding() throws IllegalArgumentException {
		new Building(0, 0);
		Building.setNumOfFloors(15);
		Building.setNumberOfCustomers(5);
		assertEquals("Floors correctly set", 15, Building.getNumOfFloors());
		assertEquals("Customers correctly set", 5,
				Building.getNumberOfCustomers());
	}

	@Test
	/** Tests the <code>isInteger()</code> method which checks if a String 
	 * input can be cast to type integer.
	 * @throws NumberFormatException
	 */
	public void testIsInteger() throws NumberFormatException {
		String input1 = "3";
		assertTrue("Passes as valid", Building.isInteger(input1));
	}

	@Test
	/**Checks that setStartFloor method in Customer works
	 * @throws IllegalAccessException
	 */
	public void testSetCurrentFloor() throws IllegalAccessException {
		Customer.setStartFloor(5);
		assertEquals("setStartFloor works", 5, Customer.getStartFloor());
	}

	@Test
	/**Checks that setStartFloor method in Customer does not allow floor 13
	 * @throws IllegalAccessException
	 */
	public void testSetStartFloorThirteen() throws IllegalAccessException {
		Customer.setStartFloor(13);
		assertEquals("setStartFloor works", 14, Customer.getStartFloor());
	}

	@Test
	/** Checks that setDestinationFloor method in Customer works
	 * @throws IllegalAccessException
	 */
	public void testSetDestinationFloor() throws IllegalAccessException {
		Customer.setDestinationFloor(5);
		assertEquals("setDestinationFloor works", 5,
				Customer.getDestinationFloor());
	}

	@Test
	/** Checks that setDestinationFloor method in Customer does not allow floor 13
	 * @throws IllegalAccessException
	 */
	public void testSetDestinationFloorThirteen() throws IllegalAccessException {
		Customer.setDestinationFloor(13);
		assertEquals("setDestinationFloor works", 14,
				Customer.getDestinationFloor());
	}

	@Test
	/** Checks that the move method moves up a floor if direction is up
	 * @throws IllegalAccessException
	 */
	public void testMoveUp() throws IllegalAccessException {
		Elevator.setCurrentFloor(10);
		Elevator.setDirection("up");
		int expected = 11;
		Elevator.move();
		assertEquals("Move up works", expected, Elevator.getCurrentFloor());
	}

	@Test
	/** Checks that the move method moves down a floor if direction is down
	 * @throws IllegalAccessException
	 */
	public void testMoveDown() throws IllegalAccessException {
		Elevator.setCurrentFloor(10);
		Elevator.setDirection("down");
		int expected = 9;
		Elevator.move();
		assertEquals("Move up works", expected, Elevator.getCurrentFloor());
	}

	@Test
	/** Checks that the pickUp method works by moving elevator to customer start floor 
	 * even if elevator must pass the destination floor.
	 * @throws IllegalAccessException
	 */
	public void testPickUpCustomer() throws IllegalAccessException {
		Customer.setStartFloor(7);
		Elevator.setCurrentFloor(10);
		while (Elevator.getCurrentFloor() != Customer.getStartFloor()) {
			Elevator.pickUpCustomer();
		}
		assertTrue(Customer.getStartFloor() == Elevator.getCurrentFloor());
	}

	@Test
	/** Checks that the dropOff method works by moving elevator from customer start floor
	 * to the destination floor.
	 * @throws IllegalAccessException
	 */
	public void testDropOffCustomer() throws IllegalAccessException {
		Customer.setDestinationFloor(17);
		Elevator.setCurrentFloor(10);
		while (Elevator.getCurrentFloor() != Customer.getDestinationFloor()) {
			Elevator.dropOffCustomer();
		}
		assertTrue(Customer.getDestinationFloor() == Elevator.getCurrentFloor());
	}

}
