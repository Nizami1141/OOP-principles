public class Car extends Vehicle {

  // The number of seats in the car.
  private int numberOfSeats;

  public Car(int year, String Brand) {
    // Call the super constructor to initialize the brand and year to "" and 0,
    // respectively.
    super(0, "");
    // Set the number of seats to 5.
    this.numberOfSeats = 5;
  }

  public Car(int year, String brand, int numberOfSeats) {
    // Call the super constructor to initialize the brand and year.
    super(0, "");
    // Set the number of seats.
    this.numberOfSeats = numberOfSeats;
  }

  public int getNumberOfSeats() {
    // Returns the number of seats.
    return this.numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    // Sets the number of seats.
    this.numberOfSeats = numberOfSeats;
  }

  @Override
  public void startEngine() {
    // Prints a message to the console indicating that the car's engine has started.
    System.out.println("Car engine start");
  }
}
