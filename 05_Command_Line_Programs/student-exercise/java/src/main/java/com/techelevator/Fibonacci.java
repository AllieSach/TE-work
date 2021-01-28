package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the Fibonacci number: ");
		int fibonacci = input.nextInt();
		int firstDigit = 0;
		int secondDigit = 1;
		int nextDigit = 1;
		System.out.print(firstDigit + " " + secondDigit + " ");
		for (int i = 0;nextDigit < fibonacci; i++) {
			System.out.print(nextDigit + " ");
			firstDigit = secondDigit;
			secondDigit = nextDigit;
			nextDigit = firstDigit + secondDigit;
			
		}
	}

}
