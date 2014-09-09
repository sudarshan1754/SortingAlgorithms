import java.util.*;

public class MergeSortUsingComparable {
	
	/*
	 * Merge Sort
	 * Divide and Conquer
	 */
	public static void main(String[] args) {
		Integer numbers[] = { 5, 1, 15, 7, 1, 2, 3};
		mergesort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

//	Source: TopCoder
//	In both Java and C# (and VB for that matter), there is an interface called 
//	Comparable (IComparable in .NET). By implementing the IComparable interface 
//	on a user-defined class, you add a method int CompareTo (object other), which 
//	returns a negative value if less than, 0 if equal to, or a positive value if 
//	greater than the parameter. The library sort functions will then work on arrays 
//	of your new data type.

	public static void mergesort(Comparable[] numbers) {
		Comparable[] temp = new Comparable[numbers.length];
		mergesort(numbers, temp, 0, numbers.length - 1);
	}

	private static void mergesort(Comparable[] numbers, Comparable[] temp,
			int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergesort(numbers, temp, left, center);
			mergesort(numbers, temp, center + 1, right);
			merge(numbers, temp, left, center + 1, right);
		}
	}

	public static void merge(Comparable[] numbers, Comparable[] temp, int left,
			int right, int rightEnd) {
		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while (left <= leftEnd & right <= rightEnd) {
			// Comparing left and right values
			if (numbers[left].compareTo(numbers[right]) <= 0) { // if less, insert left
				temp[k++] = numbers[left++];
			} else {
				temp[k++] = numbers[right++];
			}
		}
		while (left <= leftEnd) { // Copy the remaining elements when one right exhausts
			temp[k++] = numbers[left++];
		}
		while (right <= rightEnd) { // Copy the remaining elements when one left exhausts
			temp[k++] = numbers[right++];
		}
		
//		System.out.println(Arrays.toString(temp));
		for (int i = 0; i < num; i++, rightEnd--) { //to copy the elements back to original array 
			numbers[rightEnd] = temp[rightEnd];
		}
	}
}
