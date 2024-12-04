import java.util.Scanner;
//Made by Kenneth Luke Tarleton
public class DateAndTimeTester {
	private int month; //makes variables for the important info and creates the user input variable early so we can add things to it later, without having to make the program make a whole new variable each time its called.
	private int day;
	private int hour;
	private int min;
	String userInput;
	
	Scanner k = new Scanner(System.in); //keyboard

	boolean isValidDate() { //checking any invalid dates in an if statement
		if(month <= 0 || month > 12 || day <= 0) {
			return false;
		}
		else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
			return false;
		}
		else if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
			return false;
		}
		else if(month == 2 && day > 28) {
			return false;
		} 
		else { //everything that isn't the above conditions should be a correct date
			return true;
		}
	}
	
	boolean isValidTime() { //checking any invalid times, like any hours before 1 and over 12.
		if(hour < 1 || hour > 12) {
			return false;
		}
		else if(min < 0 || min > 59) {
			return false;
		} 
		else {
			return true;
		}
	}
	
	boolean isValid() { //uses the prior methods and checks if they're both true, then submitting a output to the console.
        boolean dateValid = isValidDate();
        boolean timeValid = isValidTime();
		
        if (dateValid && timeValid == true) {
            System.out.println("The date and time is valid!");
            return true;
        } else {
            System.out.println("The date and time you inputted is invalid.");
            return false;
        }
	}

	
	void getMonth() { //gets month from the user input, finds the index of the / and finds the numbers, then transforms it from a string to a int.
		int slashIndex = userInput.indexOf('/');
		String monthStr = userInput.substring(0, slashIndex);
		month = Integer.parseInt(monthStr);
	}

    void getDay() {
        int slashIndex1 = userInput.indexOf('/');
        int slashIndex2 = userInput.indexOf(' ', slashIndex1);
        String dayStr = userInput.substring(slashIndex1 + 1, slashIndex2);
        day = Integer.parseInt(dayStr);
    }

    void getHour() {
        int spaceIndex = userInput.indexOf(' ');
        int colonIndex = userInput.indexOf(':', spaceIndex);
        String hourStr = userInput.substring(spaceIndex + 1, colonIndex);
        hour = Integer.parseInt(hourStr);
    }

    void getMin() {
        int colonIndex = userInput.indexOf(':');
        String minStr = userInput.substring(colonIndex + 1);
        min = Integer.parseInt(minStr);
    }
	
	void run() { //only makes dialogue, uses methods, and gets user inputs.
			while (true) {
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid ");
			userInput = k.nextLine();
		    
			getMonth();
			getDay();
			getHour();
			getMin();
			
			isValid();
			
			System.out.println("Would you like to exit? Type 'quit' to exit or press [ENTER] to continue"); 
			String imput = k.next();
			if(imput.equals("quit")) { //must use a ".equals" when comparing strings
				System.out.println("Goodbye!");
				break;
			} else if(imput.isEmpty()) {
				continue; //i couldnt find an exact way to make it repeat using exclusively the enter button, but it does repeat after pressing a key into the console.
			}
	
		}
	}
}
