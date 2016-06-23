package com.san.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.san.utility.DeDup;
/**
 * @author Santhosh Boopal
 * JUnit test to check DeDup class
 */
public class DeDupTest {

	public static void main(String[] args) {
		

	}
	/**
	 * Method to test remove duplicates using removeDuplicatesWithArray, result should be success
	 * 
	 */
	@Ignore
	@Test
	  public void testRemoveDuplicatesUsingArray() {
	    int[] input = new int[]{4,3,4,1,2,1,2,3,5,9,6,5};
	    int[] expected = new int[]{4,3,1,2,5,9,6};
	    int[] output = new DeDup().removeDuplicatesWithArray(input);	    
	    assertArrayEquals(expected, output);
	  }
	
	/**
	 * Method to test remove duplicates using removeDuplicatesWithSet, result should be success
	 * 
	 */
	@Test
	  public void testRemoveDuplicatesUsingSet() {
	    int[] input = new int[]{4,3,4,1,2,1,2,3,5,9,6,5};
	    int[] expected = new int[]{4,3,1,2,5,9,6};
	    int[] output = new DeDup().removeDuplicates(input, true);	    
	    assertArrayEquals(expected, output);
	  }
	
	/**
	 * Method to test remove duplicates using removeDuplicatesWithArraySort, result should be failure since output will be sorted
	 * 
	 */
	@Ignore
	@Test
	  public void testSortAndRemoveDuplicates() {
	    int[] input = new int[]{4,3,4,1,2,1,2,3,5,9,6,5};
	    int[] expected = new int[]{4,3,1,2,5,9,6};
	    int[] output = new DeDup().removeDuplicates(input, false);	    
	    assertArrayEquals(expected, output);
	  }
	


}
