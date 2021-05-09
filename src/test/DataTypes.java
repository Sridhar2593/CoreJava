package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
			//Data Types in java
		
		int num1 = 20;
		int num2 = 11;
		int sum = num1 + num2;
		System.out.println("Addition value is " + sum);
		sum = num1 - num2;
		System.out.println("Subtraction value is " + sum);
		sum = num1 * num2;
		System.out.println("Multiplication value is " + sum);
		double sum1 = num1/num2;
		System.out.println("Division value is " + sum1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the User: ");
		String name = scanner.next();
		
		System.out.println("Hello: " + name);
		System.out.println("Length: " + name.length());
		System.out.println("Uppercase: " + name.toUpperCase());
		
		//--------------Arrays---------------------
		
		int myarray[] = {1, 4, 67,80};
		System.out.println("Array Value of selected index: " + myarray[3]);
		String str[] = {"Panther", "Cat", "Lion", "Tiger" };
		System.out.println("String Value of Selected array: " + str[0]);
	}

}
