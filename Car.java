public class Car {
    // Instance variables
    private int topSpeed;
    private String name;

    // Constructor
    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    // Getter methods
    public int getTopSpeed() {
        return topSpeed;
    }

    public String getName() {
        return name;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Car{name='" + name + "', topSpeed=" + topSpeed + " km/h}";
    }

    // Main method to create and print car instances
    public static void main(String[] args) {
        // Create 5 instances of Car class
        Car car1 = new Car("Ferrari", 340);
        Car car2 = new Car("Lamborghini", 350);
        Car car3 = new Car("Bugatti", 380);
        Car car4 = new Car("McLaren", 330);
        Car car5 = new Car("Porsche", 310);

        // Print the instances
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
