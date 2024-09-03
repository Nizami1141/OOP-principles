public class Motorcycle extends Vehicle {

    // Whether the motorcycle has a sidecar.
    private boolean hasSidecar;

    public Motorcycle() {
        // Call the super constructor to initialize the brand and year to "" and 0,
        // respectively.
        super(0, "");
        // Set the hasSidecar flag to false.
        this.hasSidecar = false;
    }

    public Motorcycle(int year, String brand, boolean hasSidecar) {
        // Call the super constructor to initialize the brand and year.
        super(0, "");
        // Set the hasSidecar flag.
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        // Returns the hasSidecar flag.
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        // Sets the hasSidecar flag.
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        // Prints a message to the console indicating that the motorcycle's engine has
        // started.
        System.out.println("Car engine start");
    }
}
