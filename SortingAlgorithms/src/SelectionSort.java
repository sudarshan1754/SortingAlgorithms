import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int numbers[] = { 1, 8, 10, 9, 6, 4 }; //Unsorted Array

		/*
		 * Selection Sort
		 */
		for (int i = 0; i < numbers.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[min];
			numbers[min] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
