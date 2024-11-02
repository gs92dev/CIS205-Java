/*
 * Guilherme dos Santos
 * 11/02/2024
 * In class Activity 9
 */

public class Car {

    // Static constant integer: (MAX_SPEED) set it to 200 (Maximum speed in km/h)
    // Write your code here
    private static final int MAX_SPEED = 200;

    // Instance variables: brand: string, model: String, current Speed : int &
    // fuelType : constant String
    // Write your code here
    private String brand;
    private String model;
    private int currentSpeed;
    private final String fuelType;

    // Constructor
    public Car(String fuelType) {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.fuelType = fuelType; // this is a "MUST implemented" step, why?
        // Because it is a final variable and the type of fuel is not gonna change in
        // the future
        this.currentSpeed = 0; // Start with zero speed
    }

    // Overload Constructor
    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.currentSpeed = 0; // Start with zero speed
    }

    // Method chaining for setting brand
    public Car setBrand(String brand) { // note how the return data type is Car
        // set the brand data members to the parameter
        // return the instance
        this.brand = brand;
        return this;
    }

    // Method chaining for setting model
    public Car setModel(String model) {
        // set the model data members to the parameter
        // return the instance
        this.model = model;
        return this;
    }

    // Method to accelerate the car
    public Car accelerate(int speedIncrement) {
        if ((speedIncrement + this.currentSpeed) < MAX_SPEED) {
            // check if the current speed + speed increment is less
            // or equal the max speed
            // update the current Speed by adding the speedIncrement to it
            currentSpeed += speedIncrement;

        } else {
            System.out.println("Cannot exceed maximum speed of " + MAX_SPEED + " km/h.");

        }
        return this;
        // return the instance
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Current Speed: " + currentSpeed + " km/h");
        System.out.println("Maximum Speed: " + MAX_SPEED + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    // Overloaded method to display car information with additional details
    public void displayInfo(boolean showDetails) {
        displayInfo(); // Reuse existing displayInfo() method
        if (showDetails) {
            System.out.println("Additional Details: coming soon"); // Placeholder for details
        }
    }

    public static void main(String[] args) {
        // Create instances of Car and demonstrate method chaining
        Car car1 = new Car("Toyota", "Camry", "Gasoline")
                .setBrand("Honda")
                .setModel("Accord")
                .accelerate(120);

        // Display car information using method chaining
        car1.displayInfo();

        // Display car information with additional details
        Car car2 = new Car("BMW", "X5", "Diesel");
        car2.displayInfo(true);
    }

    /*
     * output:
     * Car: Honda Accord
     * Current Speed: 120 km/h
     * Maximum Speed: 200 km/h
     * Fuel Type: Gasoline
     * Car: BMW X5
     * Current Speed: 0 km/h
     * Maximum Speed: 200 km/h
     * Maximum Speed: 200 km/h
     * Fuel Type: Diesel
     * Maximum Speed: 200 km/h
     * Maximum Speed: 200 km/h
     * Maximum Speed: 200 km/h
     * Maximum Speed: 200 km/h
     * Fuel Type: Diesel
     * Additional Details: coming soon
     */
}
