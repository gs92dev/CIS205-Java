
/*
 * Guilherme dos Santos
 * Class activity 03
 * 09/12/2024
 */
public class MainClass3 {
	public static void main(String[] args) {

		// Task 1: Check if a store is open based on the current time.
		// store working hours: from 8 to 21
		int currentHour = 14; // 24-hour format
		final int OPEN_HOUR = 8;
		final int CLOSE_HOUR = 21;

		// complete the boolean expression for the following if statement
		if (currentHour >= OPEN_HOUR && currentHour <= CLOSE_HOUR) {
			System.out.println("Store is open");
		} else {
			System.out.println("Store is closed");
		}
		// ------------------------------------------------------------------------

		// Task 2: Determine the price of a movie ticket based on the age of the person.
		int age = 70;
		double ticketPrice;
		final int CHILD_AGE = 11;
		final int ADULT_AGE_LOW = 12;
		final int ADULT_AGE_HIGH = 60;

		if (age <= CHILD_AGE) { // check if the person is a child
			ticketPrice = 5.0;
			System.out.println("Ticket price is $" + ticketPrice + " (Child rate)");
		} else if (age >= ADULT_AGE_LOW && age < ADULT_AGE_HIGH) { // check if the person is an adult
			ticketPrice = 10.0;
			System.out.println("Ticket price is $" + ticketPrice + " (Adult rate)");
		} else { // if the person is not a child nor an adult (senior). **
			ticketPrice = 7.0;
			System.out.println("Ticket price is $" + ticketPrice + " (Senior rate)");
		}
		// In nested if statements, after checking for all possible cases (child and
		// adult),
		// if a person is neither of these, then by default, that person is a senior.
		// There's no need to add an if statement for the senior case, because if the
		// checks for child and adult fail,
		// the person is considered a senior by default. Therefore, there's no need to
		// include the following
		// if statement:
		// if (age >= 60)
		// ------------------------------------------------------------------------

		// Task 3: the following nested if statement Determine the type of vehicle based
		// on a code.
		// convert it to a switch statement
		char vehicleCode = 'C';

		if (vehicleCode == 'C') {
			System.out.println("Car");
		} else if (vehicleCode == 'B') {
			System.out.println("Bus");
		} else if (vehicleCode == 'T') {
			System.out.println("Truck");
		} else if (vehicleCode == 'M') {
			System.out.println("Motorcycle");
		} else {
			System.out.println("Unknown vehicle type");
		}

		switch (vehicleCode) {
			case 'C':
				System.out.println("Car");
				break;
			/* add the other cases here including the default case */
			case 'B':
				System.out.println("Bus");
				break;
			case 'T':
				System.out.println("Truck");
				break;

			case 'M':
				System.out.println("Motorcycle");
				break;

			default:
				System.out.println("Unknown vehicle type");
		}
		// ------------------------------------------------------------------------

		// Task 4: Check if a person qualifies for a student discount.
		int studentAge = 21;
		boolean hasStudentID = true;

		// student must be 25 or older and must have a student id --> Eligible for
		// student discount
		if (studentAge >= 25 && hasStudentID == true) {
			System.out.println("Eligible for student discount");
		}

		// student must be 25 or older or has a student id --> Eligible for some
		// discount
		if (studentAge >= 25 || hasStudentID == true) {
			System.out.println("Eligible for some discount");
		}

		// student with no id (doesn't have a student id) --> Not eligible for student
		// discount
		if (hasStudentID == false) {
			System.out.println("Not eligible for student discount");
		}
		// ------------------------------------------------------------------------

		// Task 5: Compare the temperature to see if it's suitable for a picnic.
		int temperature = 75; // temperature in Fahrenheit

		if (temperature == 75) { // temperature must be 75 for perfect picnic
			System.out.println("Perfect temperature for a picnic");
		} else {
			System.out.println("Temperature is not perfect for a picnic");

			if (temperature > 80) { // if temperature is grater than 80, it's too hot for picnic
				System.out.println("It's too hot for a picnic");
			} else if (temperature < 60) { // if temperature is less than 60, it's too cold for picnic
				System.out.println("It's too cold for a picnic");
			} else { // **
				System.out.println("The temperature is suitable for a picnic");
			}

		}
		// ** the last print statement will be printed if the temperature was between 60
		// and 80 and it's not 75
		// explain why in a form of a comment:
		/*
		 * The last print statement will be printed if the temperature is between 60 and
		 * 75 because we have a nasted if statement that checks if the temperature is
		 * greater than 80 or less than 60. If the temperature is between 60 and 80, the
		 * last print statement will be executed.
		 */
		// ------------------------------------------------------------------------
		/*
		 * Output:
		 * Store is open
		 * Ticket price is $7.0 (Senior rate)
		 * Car
		 * Car
		 * Eligible for some discount
		 * Perfect temperature for a picnic
		 */

	}

}
