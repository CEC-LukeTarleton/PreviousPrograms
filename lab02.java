package lab02_triangle;
import java.util.Scanner;
//Made by Kenneth Luke Tarleton -- 9/18/24
public class Lab02_Triangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Welcome to Triangle Maker! Enter the size of your desired triangle.");
		int UserNum = keyboard.nextInt(); // gets user inputted number
		int finValue = 0; //placed here instead of inside a loop because it needs to stay consistant.
		for (int i = 1; i < UserNum+1; i++) { //creates the variable i, assigns it a value of 1, and makes it less than the user number + 1 (then, subsequently adds 1 per loop)
		    for (int j = 1; j < i+1; j++) {
		        System.out.print("*"); //the building block of our triangle
		    }
		System.out.println(" ");
		}
		for (int i = UserNum-1; i-1 >= finValue; i--) {
		    for (int j = i; j > finValue; j--) {
		        System.out.print("*");
		    }
			System.out.println(" ");
		}
	System.out.println("Done!");
	}
}