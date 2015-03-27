package elevator;

import java.util.ArrayList;

/**
 * @author abellj01
 *
 */
public class Building {
	private int numOfFloors;
	private ArrayList<Integer> customerList;
	
	private Elevator elevator;

	public Building(int numOfFloors, ArrayList<Integer> customerList) {
		this.numOfFloors = numOfFloors;
		this.customerList = customerList;
	}

	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}

	public ArrayList<Integer> getCustomerList() {
		return customerList;
	}

}
