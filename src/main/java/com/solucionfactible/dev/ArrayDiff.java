package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer Alexis Zárate
 */

public class ArrayDiff {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,2};
        int[] b = {2,4};
        System.out.println(Arrays.toString(diff(a, b)));

		int[] c= {52,123,5,125,2135};
		int[] d= {52,2135};
		System.out.println(Arrays.toString(diff(c, d)));
    }
    
    public static int[] diff(int[] a, int[] b) {
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int num : b) {
            listB.add(num);
        }
        
        for (int num : a) {
            if (!listB.contains(num)) {
                resultList.add(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}