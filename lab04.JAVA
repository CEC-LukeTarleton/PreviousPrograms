package Lab04;
import java.util.Scanner;
//Made by Kenneth Luke Tarleton
public class Lab04_MatrixAdditions {

	public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.println("Hello! Welcome to the matrix addition program. \nWe'll be adding together two matrixes of your creation.");
	System.out.println("Please enter the length and width of the first matrix: ");
	int len1 = k.nextInt();//gets the length for the first matrix
	int wid1 = k.nextInt();//gets the width for the first matrix
    int[][] matrix1 = new int[wid1][len1]; //creates the first matrix using wid1 & len1
	System.out.println("Please enter the length and width of the second matrix: ");
	int len2 = k.nextInt(); //see above:
	int wid2 = k.nextInt();
	int[][] matrix2 = new int[wid2][len2];
    int[][] sumMatrix = new int[len1][wid1];
    
	if (len1 != len2 || wid1 != wid2) { //checks if the length / width doesnt match up, making them invalid
		System.out.println("Invalid Dimensions. These cannot be added.");
		System. exit(0);
	}
	
    
    System.out.println("Enter the numbers for the first matrix: ");
    for (int i = 0; i < len1; i++) {
        for (int j = 0; j < wid1; j++) {
            System.out.print("Enter value at index " + i + " " + j + ": ");
            matrix1[i][j] = k.nextInt(); //user enters the numbers into the array for matrix1
        }
    }
    
    
    System.out.println("Enter the numbers for the second matrix: ");
    for (int i = 0; i < len2; i++) {
        for (int j = 0; j < wid2; j++) {
            System.out.print("Enter value at index " + i + " " + j + ": ");
            matrix2[i][j] = k.nextInt(); //user enters the numbers into the array for matrix2
        }
    }

    for (int i = 0; i < len1; i++) {
        for (int j = 0; j < wid1; j++) {
            sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]; //adds up each number from each matrix
        }
    }
    
    System.out.println(); // separates it from the user's text, for separation
    for (int i = 0; i < len1; i++) {
        for (int j = 0; j < wid1; j++) {
            System.out.print(matrix1[i][j] + " "); //prints each number from matrix 1
        }
        System.out.println();
    }
    
    System.out.println("+"); // plus symbol
    for (int i = 0; i < len2; i++) {
        for (int j = 0; j < wid2; j++) {
            System.out.print(matrix2[i][j] + " "); //prints each number from matrix 2
        }
    System.out.println();
    }
    
    System.out.println("="); // equals sign
    for (int i = 0; i < len1; i++) {
        for (int j = 0; j < wid1; j++) {
            System.out.print(sumMatrix[i][j] + " "); // prints the sum of the two matrixes, the one calculated earlier
        }
        System.out.println();
    }
}
}


