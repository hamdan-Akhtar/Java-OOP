public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("        OOP WEEK 1 - CAR DEMO          ");
        System.out.println("========================================\n");

        // Instantiation: new Car() creates a Car object on the heap
        // bmw is a reference variable pointing to that object
        Car bmw   = new Car();
        Car tesla = new Car();

        // Dot operator calls the method on the specific object being referenced
        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        System.out.println("--- Starting Engines ---");
        bmw.startEngine();
        tesla.startEngine();
        System.out.println();

        System.out.println("--- Initial States ---");
        System.out.println("BMW State:");
        bmw.displayState();
        System.out.println("Tesla State:");
        tesla.displayState();

        System.out.println("--- BMW Driving ---");
        bmw.drive();
        bmw.drive();
        bmw.moveFast();
        bmw.moveLeft();
        bmw.moveRight();
        bmw.horn();
        System.out.println();

        System.out.println("--- BMW Turbo Mode ---");
        bmw.turboMode();
        System.out.println();

        // Tesla is driven differently - proving both objects are independent
        System.out.println("--- Tesla Driving ---");
        tesla.drive();
        tesla.moveSlow();
        tesla.toggleHeadlights();
        tesla.toggleHeadlights();
        System.out.println();

        System.out.println("--- Final States (Objects are Independent) ---");
        System.out.println("BMW Final State:");
        bmw.displayState();
        System.out.println("Tesla Final State:");
        tesla.displayState();

        System.out.println("--- Stopping BMW Engine ---");
        bmw.stopEngine();
        bmw.displayState();

        // Rule test: drive() must be blocked when engine is off
        System.out.println("--- Rule Test: Drive with Engine OFF ---");
        bmw.drive();

        // Rule test: turboMode() must be blocked when engine is off
        System.out.println("\n--- Rule Test: Turbo with Engine OFF ---");
        bmw.turboMode();

        System.out.println("\n========================================");
        System.out.println("           CAR DEMO COMPLETE           ");
        System.out.println("========================================");
    }
}