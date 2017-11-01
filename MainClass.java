package com.roboworld;

import java.util.Scanner;


/*
 * Author: Axel Diaz
 * The app is able to take a price from user input and tell the user their tax and final price
 * Last updated: 07/12/17 at 8:47 PM
 * Ideas for improvements: 1) Create methods to find tax and final price
 *                         2) Throw an exception if user input isn't a number 
 *                         3) Round user input to the nearest hundredth (DONE)
*/

public class MainClass {

	public static void main(String[] args) {

		// instantiate object
		TaxBot tb1 = new TaxBot();

		// Scanner class reads user input
		Scanner sc = new Scanner(System.in);

		// Ask the user to input a number
		System.out.println("What is the price?");

		// set original price to user input
		tb1.setPrice(Math.round(sc.nextDouble() * 100.0) / 100.0);

		// print out original price, round it to nearest hundredth
		System.out.println("Your original price is: $" + tb1.getPrice());

		// get tax
		double userTax = tb1.getPrice() * .07;

		// get final price
		double userFinal = userTax + tb1.getPrice();

		// prints tax, rounded to the nearest hundredth
		System.out.println("Your tax is: $" + Math.round(userTax * 100.0) / 100.0);

		// prints final price, rounded to the nearest hundredth
		System.out.println("Your final price (including tax) is: $" + Math.round(userFinal * 100.0) / 100.0);

		// close scanner object
		sc.close();

	}

}
