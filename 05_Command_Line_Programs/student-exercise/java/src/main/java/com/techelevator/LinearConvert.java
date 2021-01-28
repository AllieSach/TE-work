package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length here:");
		String lengthInput = scanner.nextLine();
		int length = Integer.parseInt(lengthInput);

		System.out.println("Is the length (m)eter of (f)eet?");
		String lengthKind = scanner.nextLine();
		System.out.println(determineLength(length, lengthKind));

	}

	public static String determineLength(int length, String lengthKind) {

		double meters = (length * 0.3048);
		double feet = (length * 3.2808399);

		if (lengthKind.equals("m")) {
			return length + "M = " + feet + "F";
		} else {
			return length + "F = " + meters + "M";
		}

	}

}
