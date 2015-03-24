package battleshipAy;

import java.util.Arrays;

public class Battleship extends Ship {

	public Battleship() {
		length = 4;
		hit = new boolean[3];

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Battleship [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

	/* (non-Javadoc)
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "";
	}

}
