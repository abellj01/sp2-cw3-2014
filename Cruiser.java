package battleshipAy;

import java.util.Arrays;

public class Cruiser extends Ship {

	public Cruiser() {
		length = 3;
		hit = new boolean[2];
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
		return "Cruiser [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}
	
	

}
