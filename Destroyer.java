package battleshipAy;

import java.util.Arrays;

public class Destroyer extends Ship {

	public Destroyer() {

		length = 2;
		hit = new boolean[1];
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
		return "Destroyer [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

	
	
	

}
