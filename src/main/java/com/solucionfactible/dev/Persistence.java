package com.solucionfactible.dev;

// import java.util.Scanner;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer Alexis Zárate
 */
public class Persistence {
	public static void main(String[] args) {
		System.out.println(persistence(39));
		System.out.println(persistence(4));
		System.out.println(persistence(999));
		System.out.println(persistence(43));	
	}
	
	public static int persistence(long num) {
		int count = 0;
		while (num >= 10) {
			long temp = 1;
			while (num > 0) {
				temp *= num % 10;
				num = num / 10;
			}
			num = temp;
			count++;
		}	
		return count;
	}
}
