package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Scanner scanner = new Scanner(System.in); // Using scanner class to get input from the user
		double num1 = scanner.nextDouble();
		// System.out.println(num1);
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		// System.out.println(num2);

		System.out.println("Chosse an operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Mutiplication");
		System.out.println("4. Division");

		int choice = scanner.nextInt();
		// System.out.println(choice);

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
				System.out.println("Erro: Division by zero is not allowed");
			}
		} else {
			System.out.println("Invalid choice");
		}
	}

}