package battleshipAy;

import java.util.Scanner;

public class BattleshipGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ship[][] ships = new int[10][10];
		for (int row = 0; row < ships.length; row++) {

			for (int col = 0; col < ships[row].length; col++) {

				ships[row][col] = " "; 
			}

		}

		scan.close();
	}

}
