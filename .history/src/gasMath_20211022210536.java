
/**
 * 
 */
import java.util.*;

/**
 * @author Zachary Franke Class: Gas Pincher Math Reference Purpose: A way to
 *         help define the necessary math for the Gas Pincher App in a workable
 *         Java program Use: For reference in building the Gas Pincher App.
 * 
 *         Summary: This is a personal project using Java to prototype for a app
 *         design I had while working on rental vehicles.
 *
 */
public class gasMath {

	// Vehicle Information Section
	static String vehicleMake;
	static String vehicleModel;
	static int vehicleYear;

	// Fuel Information Section
	static double fuelTankCapacity;
	static double currentFuelLevel;
	static double targetFuelLevel;

	static int cflChoice;
	static int tgfChoice;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Gas Pincher. Please insert all information as accurately as possible. ");

		System.out.println("Enter the vehicle Fuel Capacity: ");
		fuelTankCapacity = input.nextDouble();

		System.out.println();

		System.out.println("Processing vehicle information.... Please continue with fuel amounts. ");
		System.out.println("Insert current fuel level by selecting one of the options your fuel level is closest to: ");
		System.out.println("1: 1/8 ");
		System.out.println("2: 2/8 ");
		System.out.println("3: 3/8 ");
		System.out.println("4: 4/8 ");
		System.out.println("5: 5/8 ");
		System.out.println("6: 6/8 ");
		System.out.println("7: 7/8 ");
		System.out.println("8: 0/8 ");

		cflChoice = input.nextInt();

		System.out.println();

		switch (cflChoice) {
		case 1:
			currentFuelLevel = fuelTankCapacity * 0.125;
			break;
		case 2:
			currentFuelLevel = fuelTankCapacity * 0.25;
			break;
		case 3:
			currentFuelLevel = fuelTankCapacity * 0.375;
			break;
		case 4:
			currentFuelLevel = fuelTankCapacity * 0.5;
			break;
		case 5:
			currentFuelLevel = fuelTankCapacity * 0.625;
			break;
		case 6:
			currentFuelLevel = fuelTankCapacity * 0.75;
			break;
		case 7:
			currentFuelLevel = fuelTankCapacity * 0.875;
			break;
		case 8:
			currentFuelLevel = fuelTankCapacity * 1;
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

		System.out.println("Insert target fuel level by selecting one of the options the fuel level is closest to: ");
		System.out.println("1: 1/8 ");
		System.out.println("2: 2/8 ");
		System.out.println("3: 3/8 ");
		System.out.println("4: 4/8 ");
		System.out.println("5: 5/8 ");
		System.out.println("6: 6/8 ");
		System.out.println("7: 7/8 ");

		tgfChoice = input.nextInt();

		System.out.println();

		switch (tgfChoice) {
		case 1:
			targetFuelLevel = fuelTankCapacity * 0.125;
			break;
		case 2:
			targetFuelLevel = fuelTankCapacity * 0.25;
			break;
		case 3:
			targetFuelLevel = fuelTankCapacity * 0.375;
			break;
		case 4:
			targetFuelLevel = fuelTankCapacity * 0.5;
			break;
		case 5:
			targetFuelLevel = fuelTankCapacity * 0.625;
			break;
		case 6:
			targetFuelLevel = fuelTankCapacity * 0.75;
			break;
		case 7:
			targetFuelLevel = fuelTankCapacity * 0.875;
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Info acquired, processing information now.");

		double result = targetFuelLevel - currentFuelLevel;

		System.out.println("Result: Fill vehicle with " + result + " gallons.");

		input.close();
	}

}
