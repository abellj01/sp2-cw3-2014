package elevatorAy;

import java.util.ArrayList;

/**
 * @author abellj01
 *
 */
public class Elevator {
	private int currentFloor;
	private ArrayList<Integer> registerList;
	private boolean direction;

	/**
	 * The fixed number of floor serviced by the elevator
	 */
	private static final int NUM_OF_FLOORS = 19;

	public Elevator(int currentFloor, ArrayList<Integer> registerList,
			boolean direction) {
		currentFloor = 0;
		this.registerList = registerList;
		direction = false;
	}

	public void move() {
		if (direction == true) {
			currentFloor++;
			System.out.println("The Lift is going up!. There are currently "
					+ registerList.size() + " passengers on board.");
		} else {
			currentFloor--;
			System.out.println("The lift is going down. There are currently "
					+ registerList.size() + " passengers on board.");
		}
	}

	public void customerJoins(Customer customer) {
		registerList.add(registerList.size());

	}

	public void customerLeaves(Customer customer) {
		registerList.remove(registerList.size());

	}

}
