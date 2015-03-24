package battleshipAy;

import java.util.Arrays;

public class EmptySea extends Ship {

	public EmptySea() {
		length = 1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#shootAt(int, int)
	 */
	@Override
	public boolean shootAt(int row, int column) {
		return super.shootAt(row, column);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#isSunk()
	 */
	@Override
	public boolean isSunk() {
		return super.isSunk();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmptySea [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

}
