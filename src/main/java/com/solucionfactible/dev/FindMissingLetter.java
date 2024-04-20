package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer Alexis Zárate
 */
public class FindMissingLetter {

	public static void main(String[] args) {
		char[] array = {'a', 'b', 'c', 'f'};
		System.out.println(findMissingLetter(array));

		char[] array2 = {'k','l','n','o'};
		System.out.println(findMissingLetter(array2));

		char[] array3= {'X','Z'};
		System.out.println(findMissingLetter(array3));
	}
	
	public static char findMissingLetter(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i+1] - array[i] > 1) {
				return (char) (array[i] + 1);
			}
		}
		
		return ' ';
	}

}
