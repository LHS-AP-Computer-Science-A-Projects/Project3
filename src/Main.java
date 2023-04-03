// Import the Scanner utility class.
import java.util.Scanner;

// Calculates momentum of an object based on inputted variables resultant to the physics formula.
public class Main {

	/** Compiler constructor. */
  	public static void main(String[] args) {
		// Instantiates the scanner object.
    	Scanner scanner = new Scanner(System.in);

		// Requests an input from the user for the mass variable.
		System.out.println("How much mass (kg) is the object?");
		double mass = scanner.nextDouble();

		// Requests an input from the user for the velocity variable.
		System.out.println("What is the velocity (m/s) of the object?");
		double velocity = scanner.nextDouble();

		// Prints the momentum based on the given velocity and mass by multiplication of the two.
		System.out.println("The object's momentum is " + mass * velocity + " kg*m/s.");

		// Close the scanner to end the runnable.
		scanner.close();
  	}
}