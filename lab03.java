package lab03;
import java.util.Scanner;
//Made by Kenneth Luke Tarleton
public class Lab03_Temprature {
	public static void main(String[] args) {
		System.out.println("Hello! Please add the temprature for each day! Then, we'll define the temprature average and see whats below the average!");
		Scanner keyboard = new Scanner(System.in); //scanner/how to access the user input
		int l = 10; // l = length
		float[] tempNumbers = new float[l];
		int[] day = {1,2,3,4,5,6,7,8,9,10};
		float sum = 0; //sum will be defined later
		int dayNum = 1;
		
		for(int i = 0; i < l; i++) {
			System.out.println("Input the temprature for day " + dayNum + ":");
			dayNum++;
			tempNumbers[i] = keyboard.nextFloat(); //gets the user-inputted numbers and puts it into each array number listed in 'l'
			}
		
		for(int i = 0; i < tempNumbers.length; i++) {
			sum += tempNumbers[i]; //sets the sum as the total of all the array numbers
			}
		
		float avg = sum/l;
		System.out.println("The temprature average is: " + avg); //to get the average, you must get the sum and divide it by the amount
		System.out.println("The tempratures listed are all below the average: ");
		for(int i = 0; i < tempNumbers.length ; i++) {
			if(tempNumbers[i] < avg) {
				System.out.println("Day " + day[i] + " with " + tempNumbers[i]);
			} 
			//I NEARLY GAVE UP ON STATING THE DAY BUT I PULLED THROUGH AND DID IT!!!!!!!!
		}
	}
}
