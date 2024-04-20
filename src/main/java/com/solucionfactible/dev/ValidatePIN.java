package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer Alexis Zárate
 */
public class ValidatePIN {
	public static void main(String[] args) {
		String pin = "1234";
		String pin4 = "098765";
		
		System.out.println(isValid(pin));
		System.out.println(isValid(pin4));

		String pin10 = "..1234#!";

		System.out.println(isValid(pin10));

		String pin17 = "1.241";
		String pin18 = "00000000";
		String pin19 = "12 34";
		String pin20 = "0";
		String pin21 = " 1234 ";
		String pin22 = "98  76";
		String pin23 = " 1111";

		System.out.println(isValid(pin17));
		System.out.println(isValid(pin18));
		System.out.println(isValid(pin19));
		System.out.println(isValid(pin20));
		System.out.println(isValid(pin21));
		System.out.println(isValid(pin22));
		System.out.println(isValid(pin23));
	}
	
	public static boolean isValid(String pin) {
		return (pin.length() == 4 || pin.length() == 6) && pin.matches("\\d+");
	}

}
