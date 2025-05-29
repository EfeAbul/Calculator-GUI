# Calculator

This project is a simple calculator application developed using Java Swing. It features a graphical user interface with buttons for digits and basic operations, allowing users to perform arithmetic calculations.

## Features

- Interactive graphical user interface (GUI)
- Basic arithmetic operations: addition, subtraction, multiplication, division
- GUI built using Java Swing components
- Digits are rendered on the screen using lines via the `Graphics` class, providing a custom visual representation
- Uses appropriate variables to keep track of user inputs and operations

## Requirements

- Java Development Kit (JDK)
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or terminal access to `javac` and `java` commands

## How to Run

1. Open the project in a Java development environment.
2. Compile the `HesapMakinesi.java` file:
   ```bash
   javac HesapMakinesi.java
   ```
3. Run the program:
   ```bash
   java HesapMakinesi
   ```

## Notes

- The project extends `JFrame` and implements the `ActionListener` interface.
- GUI components include `JPanel`, `JButton`, and `JLabel`, built using Java Swing.
- Inputs are stored in string variables and processed accordingly when operation buttons are pressed.
- Instead of displaying digits as plain text, they are drawn on the screen using custom graphics, creating a more visual experience.
