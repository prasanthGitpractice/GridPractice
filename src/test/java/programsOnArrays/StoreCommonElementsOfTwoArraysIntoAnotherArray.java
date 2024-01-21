package programsOnArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class StoreCommonElementsOfTwoArraysIntoAnotherArray 
{
	  public static void main(String[] args) {
	        // Two example arrays
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {3, 4, 5, 6, 7};

	        // Find common elements and store in another array
	        int[] commonElements = findCommonElements(array1, array2);

	        // Print the common elements
	        System.out.println("Common elements between the two arrays: " + Arrays.toString(commonElements));
	    }

	    // Function to find common elements between two arrays
	    public static int[] findCommonElements(int[] array1, int[] array2) {
	        ArrayList<Integer> commonList = new ArrayList<>();

	        for (int element : array1) {
	            if (contains(array2, element) && !commonList.contains(element)) {
	                commonList.add(element);
	            }
	        }

	        // Convert ArrayList to array
	        int[] commonArray = new int[commonList.size()];
	        for (int i = 0; i < commonList.size(); i++) {
	            commonArray[i] = commonList.get(i);
	        }

	        return commonArray;
	    }

	    // Function to check if an array contains a specific element
	    public static boolean contains(int[] array, int element) {
	        for (int value : array) {
	            if (value == element) {
	                return true;
	            }
	        }
	        return false;
	    }	
}
