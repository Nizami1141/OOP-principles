
public class Main {
    public static void race(Vehicle[] vehicles) {
        // Iterate through the array of vehicles.
        for (Vehicle vehicle : vehicles) {
            try {
                // Start the engine of the vehicle.
                vehicle.startEngine();
            } catch (Exception e) {
                // Handle the exception (e.g., print an error message).
                System.out.println("Error accessing" + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of vehicles.
        Vehicle[] vehicles = new Vehicle[2];

        // Create a car and add it to the array of vehicles.
        vehicles[0] = new Car(2019, "Lada2107", 4);

        // Create a motorcycle and add it to the array of vehicles.
        vehicles[1] = new Motorcycle(2020, "Harley Davidson", false);

        // Start the race by calling the `race()` method.
        race(vehicles);

        try {
            // Get the year of the car.
            int year = vehicles[0].getYear();

            // Set the year of the motorcycle.
            vehicles[1].setYear(2021);

            // Get the brand of the motorcycle.
            String brand = vehicles[1].getBrand();

            // Set the brand of the car.
            vehicles[0].setBrand("Lada");
        } catch (Exception e) {
            // Handle the exception (e.g., print an error message).
            System.out.println("Error accessing " + e.getMessage());
        }
    }
}

// The inheritance principle allows us to reuse code by creating new classes
// that inherit from existing classes.
// The polymorphism principle allows different types of objects to behave
// differently depending on their type.
//
// In this application, the Vehicle class is an abstract class that defines the
// common properties and methods of all vehicles.
// The Car class and the Motorcycle class inherit from the Vehicle class, and
// they can each add their own specific properties and methods.
// The startEngine() method is defined in the Vehicle class, but the Car class
// and the Motorcycle class can override the startEngine() method to provide
// their own implementation of the method.