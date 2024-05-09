package day6;

import java.util.Scanner;

public class Diagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");

		int rows = sc.nextInt();
		System.out.println("Enter Cols: ");
		int cols = sc.nextInt();
		
		System.out.println("Enter Numbers: ");

		int[][] matrix = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
