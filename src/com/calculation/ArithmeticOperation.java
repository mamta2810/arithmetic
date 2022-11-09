package com.calculation;

import java.util.Scanner;

import com.advance.assignment.Calculation;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the input numbers");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		Calculation obj = new Calculation();
		int add = obj.add(23, 12);
		System.out.println("Addition of numbers is " + add);
		
		int sub = obj.sub(num1, num2);
		System.out.println("Subtraction of numbers is " + sub);
		
		int mul = obj.mul(num1, num2);
		System.out.println("Multiplication of numbers is " + mul);
		
		float div =  obj.div(num1, num2);
		System.out.println("Division of numbers is " + div);
		
		int mod = obj.mod(num1, num2);
		System.out.println("Modulus of numbers is " + mod);
		
		System.out.println("New Line");
		reader.close();

	}

}
