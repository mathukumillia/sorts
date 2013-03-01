/**
 * Sorts.java
 * 		performs Quadratic sorts
 * 
 */

import java.util.Random;

public class Sorts {
	
	/**
	 * main
	 * 		tests the other methods in the class
	 * 		
	 * @param  args - command line arguments
	 * 
	 */
	public static void main(String[] args) {
		int length = 10;
		int[][] sortsTest = new int[5][length];
		for(int i = 0; i<sortsTest.length; i++){
			sortsTest[i] = randomArray(length, 21, 345);
			System.out.print("Unsorted Array: ");
			print(sortsTest[i]);
			System.out.println();
			System.out.println("Selection Sort: ");
			print(selectionSort(sortsTest[i]));
			System.out.println();
			System.out.println("Bubble Sort: ");
			print(bubbleSort(sortsTest[i]));
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
		}
	}

	/**
	 * randomArray
	 *    returns an int[] with a given length containing randomly selected values between a given min and max
	 *
	 * @param length - the length of the array you want to return
	 * @param  min - the minimum value that any value in the array can hold
	 * @param  max - the maximum value that any value in the array can hold
	 *
	 * @return int[]
	 * 
	 */
	public static int[] randomArray(int length, int min, int max){
		int[] result = new int[length];
		int j = 0;
		int randomNum;
		int[] possibleNums = new int[(max-min) + 1];
		Random rand = new Random();

		for(int i = min; i <= max; i++){ 
			possibleNums[j] = i;
			j++;
		}
		for(int k = 0; k < result.length; k++){
			result[k] = possibleNums[rand.nextInt((max-min) + 1)];
		}
		return result;
	}


	/**
	 * print
	 * 		prints out a given array surrounded by square brackets and with commas separating values
	 * 		d
	 * @param x - the array that you want to print out
	 */
	public static void print(int[] array){
		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
			if(i != array.length - 1){
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}

	/**
	 * selectionSort
	 * 		performs a selection sort on an array
	 *
	 * @param x - the array you want to sort
	 *
	 * @return  int[] - sorted array
	 */
	public static int[] selectionSort(int[] x){
		int[] y = setArray(x);
		//System.out.println("This is selectionSort");
		int temp = 0;
		int max;
		for(int i = 0; i < y.length; i++){
			max = y[i];
			for(int j = i+1; j<y.length; j++){
				if(y[j] > max){
					max = y[j];
					temp = y[j];
					y[j] = y[i];
					y[i] = temp;
				}
			}
		}
		return y;	
	}
	/**
	 * bubbleSort
	 * 		performs a bubble sort
	 *
	 * @param x - array to be sorted 
	 *
	 * @return int[] - sorted array
	 */
	public static int[] bubbleSort(int[] x){
		int[] z = setArray(x);
		int temp = 0;
		int swap = -1;
		int j = 0;
		while(swap != 0){
			swap = 0;	
			for(int i = 0; i < z.length - 1; i++){
				j=i+1;
				if(z[j] > z[i]){
					temp = z[i];
					z[i] = z[j];
					z[j] = temp;
					swap++;
				}
			}
		}
		return z;
	}

	/**
	 * insertionSort
	 * 		sorts an array using the insertion sort method
	 *
	 * @param x - the array that you want to sort
	 *
	 * @return  int[] - the sorted array
	 */
	public static int[] insertionSort(int[] x){
		int[] a = setArray(x);

	}

	/**
	 * setArray
	 * 		makes a copy of the array that was passed in
	 *
	 * @param x - the array you want to make a copy of
	 *
	 * @return int[] - the copy of the array
	 */
	public static int[] setArray(int[] x){
		int[] copy = new int[x.length];
		for(int i = 0; i<x.length; i++){
			copy[i] = x[i]; 
		}
		return copy;
	}
}