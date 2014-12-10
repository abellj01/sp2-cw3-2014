package elevatorAy;

/**
 * @author abellj01
 *
 */
public class Customer {

	private int currentFloor;
	private int destinationFloor;
	private boolean inElevator;
	private boolean finished;

	private static int ID = 0;

	public Customer(int currentFloor, int destinationFloor) {
		ID++;
		this.currentFloor = currentFloor;
		this.destinationFloor = destinationFloor;
	}

	public int getID() {
		return ID;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void getDestinationFloor(int destinationFloor) {
		if(destinationFloor > 20 || destinationFloor < 0 || destinationFloor == 13) {
			System.out.println("Invalid selection");
		} else if (destinationFloor > 13){
			destinationFloor --;
		} else {
			this.destinationFloor = destinationFloor;
		}
	}

}
