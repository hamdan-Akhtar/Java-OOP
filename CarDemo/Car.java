public class Car {

    // Private fields - each Car object stores its own state
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private int fuelLevel;
    private int gear;
    private boolean headlightsOn;
    private boolean turboActive;
    private double odometer;

    // No-argument constructor - sets default values when Car() is called
    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.gear = 0;
        this.headlightsOn = false;
        this.turboActive = false;
        this.odometer = 0.0;
    }

    // this.brand refers to the field; brand refers to the parameter
    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        if (this.fuelLevel <= 0) {
            System.out.println(this.brand + ": Cannot start - No fuel!");
            return;
        }
        this.engineOn = true;
        this.gear = 0;
        System.out.println(this.brand + ": Engine STARTED.");
    }

    public void stopEngine() {
        // Speed resets to zero when engine is stopped
        this.speed = 0;
        this.engineOn = false;
        this.gear = 0;
        this.turboActive = false;
        System.out.println(this.brand + ": Engine STOPPED.");
    }

    public void drive() {
        // Car must not move while engine is off
        if (!this.engineOn) {
            System.out.println(this.brand + ": Cannot drive - Engine is OFF!");
            return;
        }
        if (this.fuelLevel <= 0) {
            System.out.println(this.brand + ": Cannot drive - Out of fuel!");
            return;
        }
        this.speed += 20;
        this.odometer += 0.5;
        this.fuelLevel -= 5;
        if (this.speed <= 40) this.gear = 2;
        else if (this.speed <= 80) this.gear = 3;
        else this.gear = 4;
        System.out.println(this.brand + ": Driving at " + this.speed + " km/h | Gear: " + this.gear);
    }

    public void moveFast() {
        if (!this.engineOn) {
            System.out.println(this.brand + ": Cannot accelerate - Engine is OFF!");
            return;
        }
        if (this.fuelLevel <= 0) {
            System.out.println(this.brand + ": Out of fuel!");
            return;
        }
        this.speed += 40;
        this.odometer += 1.0;
        this.fuelLevel -= 10;
        this.gear = 5;
        System.out.println(this.brand + ": Moving FAST at " + this.speed + " km/h | Gear: " + this.gear);
    }

    public void moveSlow() {
        if (!this.engineOn) {
            System.out.println(this.brand + ": Engine is OFF!");
            return;
        }
        this.speed -= 20;
        // Speed must never go negative
        if (this.speed < 0) {
            this.speed = 0;
        }
        this.fuelLevel -= 2;
        if (this.speed == 0) this.gear = 0;
        else if (this.speed <= 20) this.gear = 1;
        System.out.println(this.brand + ": Slowing down to " + this.speed + " km/h | Gear: " + this.gear);
    }

    public void moveLeft() {
        if (!this.engineOn) {
            System.out.println(this.brand + ": Cannot turn - Engine is OFF!");
            return;
        }
        System.out.println(this.brand + ": Turning LEFT.");
    }

    public void moveRight() {
        if (!this.engineOn) {
            System.out.println(this.brand + ": Cannot turn - Engine is OFF!");
            return;
        }
        System.out.println(this.brand + ": Turning RIGHT.");
    }

    public void horn() {
        System.out.println(this.brand + ": BEEP BEEP!");
    }

    // Turbo doubles speed instantly - creative thrilling feature
    public void turboMode() {
        if (!this.engineOn) {
            System.out.println(this.brand + ": Cannot activate turbo - Engine is OFF!");
            return;
        }
        if (this.fuelLevel < 20) {
            System.out.println(this.brand + ": Not enough fuel for TURBO!");
            return;
        }
        if (this.turboActive) {
            System.out.println(this.brand + ": TURBO already ACTIVE!");
            return;
        }
        this.turboActive = true;
        this.speed = this.speed * 2;
        this.fuelLevel -= 20;
        this.gear = 6;
        System.out.println(this.brand + ": TURBO MODE ACTIVATED! Speed: " + this.speed + " km/h!");
    }

    public void toggleHeadlights() {
        this.headlightsOn = !this.headlightsOn;
        if (this.headlightsOn) {
            System.out.println(this.brand + ": Headlights ON.");
        } else {
            System.out.println(this.brand + ": Headlights OFF.");
        }
    }

    public void displayState() {
        System.out.println("=============================");
        System.out.println("Brand        : " + this.brand);
        System.out.println("Color        : " + this.color);
        System.out.println("Speed        : " + this.speed + " km/h");
        System.out.println("Engine On    : " + this.engineOn);
        System.out.println("Fuel Level   : " + this.fuelLevel + "%");
        System.out.println("Gear         : " + this.gear);
        System.out.println("Headlights   : " + this.headlightsOn);
        System.out.println("Turbo Active : " + this.turboActive);
        System.out.println("Odometer     : " + this.odometer + " km");
        System.out.println("=============================");
        System.out.println();
    }
}

