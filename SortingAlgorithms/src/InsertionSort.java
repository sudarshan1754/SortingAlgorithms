import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int numbers[] = { 1, 8, 13, 15, 6, 4 }; // Unsorted Array

		/*
		 * Insertion Sort 
		 * Decrease and conquer method
		 */
		int v, j;
		for (int i = 1; i < numbers.length; i++) {
			v = numbers[i];
			j = i - 1;
			while (j >= 0 & numbers[j] > v) {
				numbers[j + 1] = numbers[j];
				j = j - 1;
			}
			numbers[j + 1] = v;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
