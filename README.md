# Week 1 Lab - Object-Oriented Programming
**Student:** Hamdan Akhtar
**Seat No:** B25000116050
**Course:** Object-Oriented Programming (4 Credit Hours - 3 Theory + 1 Lab)
**Supervisor:** Dr. Humera Tariq
**Date:** July 2026

---

## Project Structure

```
week01_Hamdan_050/
├── CarDemo/
│   ├── Car.java
│   ├── Main.java
│   └── Car_UML.png
├── CalculatorDemo/
│   ├── Calculator.java
│   ├── Main.java
│   └── Calculator_UML.png
└── SampleOutput.txt
```

---

## What This Lab Is About

This lab introduces the fundamental concept of **Object-Oriented Programming (OOP)** — thinking in objects. Real-world objects are observed, their attributes and behaviours are identified, a UML class diagram is drawn, and then the design is translated into working Java code.

---

## Part 1 - CarDemo

### What the Car Class Does
The `Car` class models a real-world car as a software object. It stores the state of a car and provides methods to change and display that state.

### Attributes
| Attribute | Type | Description |
|-----------|------|-------------|
| brand | String | Brand name of the car |
| color | String | Color of the car |
| speed | int | Current speed in km/h |
| engineOn | boolean | Whether the engine is running |
| fuelLevel | int | Fuel percentage from 0 to 100 |
| gear | int | Current gear from 0 to 6 |
| headlightsOn | boolean | Whether headlights are on |
| turboActive | boolean | Whether turbo mode is active |
| odometer | double | Total distance traveled in km |

### Methods
| Method | Description |
|--------|-------------|
| Car() | No-argument constructor, sets default values |
| setDetails(brand, color) | Sets the brand and color of the car |
| startEngine() | Starts the engine if fuel is available |
| stopEngine() | Stops the engine and resets speed to zero |
| drive() | Increases speed by 20 km/h |
| moveFast() | Increases speed by 40 km/h |
| moveSlow() | Decreases speed by 20 km/h, never goes negative |
| moveLeft() | Turns the car left |
| moveRight() | Turns the car right |
| horn() | Sounds the horn |
| turboMode() | Doubles the speed instantly - creative feature |
| toggleHeadlights() | Switches headlights on or off |
| displayState() | Prints all current attribute values |

### Rules Enforced
- Car cannot drive while engine is off
- Speed can never become negative
- stopEngine() always resets speed to zero
- Turbo requires at least 20% fuel
- Car cannot start with zero fuel

### How to Run
```powershell
cd CarDemo
javac Car.java Main.java
java Main
```

---

## Part 2 - CalculatorDemo

### What the Calculator Class Does
The `Calculator` class is a **stateless** class — it stores no attributes. It only provides mathematical operations through its methods.

### Methods
| Method | Description |
|--------|-------------|
| add(first, second) | Returns sum of two values |
| subtract(first, second) | Returns difference of two values |
| multiply(first, second) | Returns product of two values |
| divide(first, second) | Returns quotient, handles division by zero |
| modulus(first, second) | Returns remainder, handles modulus by zero |
| power(base, exponent) | Returns base raised to the power of exponent |
| maximum(first, second) | Returns the larger of two values |
| minimum(first, second) | Returns the smaller of two values |
| average(double... numbers) | Returns average of any number of values |
| addMany(double... numbers) | Returns sum of any number of values |

### Edge Cases Handled
- Division by zero prints an error and returns 0
- Modulus by zero prints an error and returns 0
- Average with no arguments prints an error and returns 0

### How to Run
```powershell
cd CalculatorDemo
javac Calculator.java Main.java
java Main
```

---

## Key OOP Concepts Covered

| Concept | Where Used |
|---------|-----------|
| Class | Car.java and Calculator.java |
| Object | bmw and tesla created in CarDemo Main.java |
| Attribute | All private fields in Car class |
| Behaviour | All public methods in both classes |
| Constructor | Car() sets default values on instantiation |
| Encapsulation | All Car fields are private |
| this keyword | Used in Car methods to refer to current object |
| Dot operator | Used in Main.java to call methods on objects |
| Reference variable | bmw and tesla store references not objects |
| Varargs | average() and addMany() in Calculator |

---

## UML Diagrams

- `CarDemo/Car_UML.png` — UML class diagram for the Car class
- `CalculatorDemo/Calculator_UML.png` — UML class diagram for the Calculator class

---

## Sample Output

See `SampleOutput.txt` for complete program output from both demos.

---

## Requirements

- JDK 17 or later
- Visual Studio Code
- PowerShell or any terminal