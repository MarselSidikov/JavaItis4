class Program {
	public static int sumInRange(int a, int b) {
		int result = 0;
		for (int i = a; i <= b; i++) {
			result += i; // result = result + i;
		}

		return result;
	}

	// функция должна вернуть true, если число четное
	// false - если нечетное
	// boolean condition = true/false
	// isEven
	public static boolean isEven(int a) {
		/**
		boolean result = false;
		if (a % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
		**/
		return a % 2 == 0;
	}

	public static void main(String[] args) {
		int sum = sumInRange(2, 6);
		System.out.println(sum);
		System.out.println(isEven(6));
	}

}