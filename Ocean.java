package battleshipAy;

import java.util.Random;

public class Ocean {

	private Ship[][] ships;
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;

	public Ocean(Ship[][] ships, int shotsFired, int hitCount, int shipsSunk) {
		super();
		ships = new Ship[10][10];
		this.shotsFired = shotsFired;
		this.hitCount = hitCount;
		this.shipsSunk = shipsSunk;
	}

	public void placeAllShipsRandomly() {

		Random rnd = new Random();

	}

	public boolean isOccupied(int row, int column) {
		return false;

	}

	public boolean shootAt(int row, int column) {
		return false;

	}

	/**
	 * @return the shotsFired
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * @return the hitCount
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * @return the shipsSunk
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}

	public boolean isGameOver() {
		return false;

	}

	/**
	 * @return the ships
	 */
	public Ship[][] getShipArray() {
		return ships;
	}

	private void print() {

	}

}
