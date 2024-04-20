package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer Alexis Zárate
 */
public class AreSame {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		// System.out.println(comp(a, b));
		System.out.println(comp(a, b));

		int[] c = {1,2,3,4,5};
		int[] d = {1,4,9,16,25};
		// System.out.println(comp(c, d));
		System.out.println(comp(c, d));
	}

	public static boolean comp(int[] a, int[] b) {
		for (int elemB : b) {
			boolean squared = false;
			for (int elemA : a) {
				if (elemA * elemA == elemB) {
					squared = true;
					break;
				}
			}
			if (!squared) {
				return false;
			}
		}
		return true;
	}

}
