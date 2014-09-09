import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int numbers[] = { 1, 8, 13, 11, 6, 4 }; // Unsorted Array

		/*
		 * Bubble Sort
		 */
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}

}
