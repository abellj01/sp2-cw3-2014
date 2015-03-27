package battleshipAy;

import java.util.Arrays;

public class Submarine extends Ship {

	public Submarine() {

		length = 1;
		hit = new boolean[0];
	
	}
	
	/* (non-Javadoc)
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Submarine [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}
	
	
	
	

}

