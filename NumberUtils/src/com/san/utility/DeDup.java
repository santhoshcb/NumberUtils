package com.san.utility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * @author Santhosh Boopal
 * Class has implementations to remove duplicate values in int array
 */
public class DeDup {

	int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86,
			25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15,
			6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20,
			17, 16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7,
			15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	public static void main(String[] args) {

		new DeDup().processDuplicates();
	}
	
	/**
	 * Method that processes int array to remove duplicates 
	 * 
	 */
	private void processDuplicates() {
		System.out.print("Before Processing input numbers: ");
		for (int a = 0; a < randomIntegers.length; a++) {
			System.out.print(randomIntegers[a] + " ");
		}
		randomIntegers = removeDuplicatesWithSet(randomIntegers);	
		//randomIntegers = removeDuplicates(randomIntegers, true);
		System.out.println();
		System.out.println();
		System.out.print("After Processing and removing duplicates: ");
		for (int a = 0; a < randomIntegers.length; a++) {
			System.out.print(randomIntegers[a] + " ");
		}
	}
	
	/**
	 * Returns an int array after removing duplicates and the process determine order based on boolean param. 
	 *
	 * @param arr an int array with duplicate values
	 * @param maintainOrder boolean that determines on order
	 * @return int array after removing duplicates
	 * 
	 */
	public int[] removeDuplicates(int[] arr, boolean maintainOrder)
	{
		if(maintainOrder)
			return removeDuplicatesWithSet(arr);
		else
			return removeDuplicatesWithArraySort(arr);
	}

	/**
	 * Returns an int array after removing duplicates and the process will maintain order. 
	 * Method uses multiple arrays to remove duplicates and maintain order
	 *
	 * @param arr an int array with duplicate values
	 * @return int array after removing duplicates and maintains order
	 * 
	 */

	public int[] removeDuplicatesWithArray(int[] arr) {
		System.out.print("Inside");
		int[] temp = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean exist = false;
			for (int j = 0; j < temp.length; j++) {
				if (arr[i] == temp[j]) {
					exist = true;
				}
			}
			if (!exist) {
				temp[count] = arr[i];
				count++;
			}
		}
		return Arrays.copyOf(temp, count);

	}

	/**
	 * Returns an int array after removing duplicates and the process will maintain order. 
	 * Method uses Set to remove duplicates and maintain order
	 *
	 * @param arr an int array with duplicate values
	 * @return int array after removing duplicates and maintains order
	 * 
	 */
	public int[] removeDuplicatesWithSet(int[] arr) {

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		//This step is done to convert Set with Integers to primitive array
		int[] temp = new int[set.size()];
		Iterator<Integer> itr = set.iterator();
		int j = 0;
		while (itr.hasNext()) {
			temp[j] = (Integer) itr.next();
			j++;
		}
		return temp;

	}

	
	/**
	 * Returns an int array after sorting and removing duplicates, since the sort is performed order will not be maintained. 
	 * Method uses Set to remove duplicates and maintain order
	 *
	 * @param arr an int array with duplicate values
	 * @return int array after removing duplicates and maintains order
	 * 
	 */
	public int[] removeDuplicatesWithArraySort(int[] arr) {

		Arrays.sort(arr);
		int i = 0;
		int j = 0;
		while (i < arr.length) {
			if (arr[i] == arr[j]) {
				i++;
			} else {
				j++;
				arr[j] = arr[i];
				i++;
			}
		}

		return Arrays.copyOf(arr, j + 1);

	}

}
