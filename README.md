# 🧮 Simple Java Calculator

This is a basic **console-based Calculator** program written in Java.
It allows users to input two numbers and choose an arithmetic operation to perform:
**Addition, Subtraction, Multiplication, or Division**.

---

## 📌 Features

* Accepts two numerical inputs from the user
* Provides a simple menu of operations
* Performs:

  * ➕ Addition
  * ➖ Subtraction
  * ✖️ Multiplication
  * ➗ Division (with zero-division handling)
* Displays the output on the console
* Handles invalid menu choices

---

## 🛠️ Technologies Used

* **Java**
* **Scanner** class for user input

---

## 🚀 How to Run the Program

1. Ensure you have the **Java JDK** installed (version 8 or above).

2. Save the file as `Calculator.java` inside the `day3` package directory.

3. Open a terminal and navigate to the project folder.

4. Compile the program:

   ```bash
   javac day3/Calculator.java
   ```

5. Run the program:

   ```bash
   java day3.Calculator
   ```

---

## 💻 Program Flow

1. User enters the **first number**

2. User enters the **second number**

3. User selects an **operation**:

   ```
   1. Addition
   2. Subtraction
   3. Multiplication
   4. Division
   ```

4. Program performs the calculation and shows the result

5. Division includes a check to prevent dividing by zero

---

## 📂 Code Example

```java
Scanner scanner = new Scanner(System.in);
double num1 = scanner.nextDouble();
double num2 = scanner.nextDouble();
int choice = scanner.nextInt();

if (choice == 1) {
    System.out.println("Result: " + (num1 + num2));
} else if (choice == 2) {
    System.out.println("Result: " + (num1 - num2));
} else if (choice == 3) {
    System.out.println("Result: " + (num1 * num2));
} else if (choice == 4) {
    if (num2 != 0) {
        System.out.println("Result: " + (num1 / num2));
    } else {
        System.out.println("Error: Division by zero is not allowed");
    }
} else {
    System.out.println("Invalid choice");
}
```

---

## 📝 Notes

* Input must be numeric; otherwise, the program will throw an exception.
* You can extend this calculator by adding:

  * Modulus
  * Power function
  * Loop to allow multiple operations
  * Error handling for invalid inputs

---

## 📜 License

This project is free to use and modify for learning purposes.

---

Just tell me!

