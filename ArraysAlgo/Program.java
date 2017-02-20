import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[] = {2, 5, -10, 1, 100, -9};

		/**
		int array[] = new int[6];
		a[0] = 2;
		a[1] = 5;
		a[2] = -10;
		a[3] = 1;
		a[4] = 100;
		a[5] = -9;
		**/

		int elementFroSearch;
		System.out.println("Please, enter element for search");
		elementFroSearch = scanner.nextInt();

		int elementPosition = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == elementFroSearch) {
				elementPosition = i;
			}
		}

		if (elementPosition != -1) {
			System.out.println("Element found in " + elementPosition);
		} else {
			System.out.println("Element not found");	
		}

		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				} 
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}