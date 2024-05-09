package day6;

import java.util.Scanner;

public class AntiDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int row = sc.nextInt();
		System.out.println("Enter Cols: ");
		int clos = sc.nextInt();
		
		System.out.println("Enter Numbers: ");
		int[][] mat = new int[row][clos];
		
		System.out.println("Enter Matrix ");
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < clos ; j ++) {
				mat[i][j] = sc.nextInt();			}
		}
		
		
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < clos ; j++) {
				if(i + j == row - 1 ) {
					System.out.print(mat[i][j]+ " ");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
