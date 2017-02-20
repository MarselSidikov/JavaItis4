class Program {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(int b[], int i, int j) {
		int temp = b[i];
		b[i] = b[j];
		b[j] = temp;
	}

	public static void main(String[] args) {
		int x = 6;
		int y = 8;
		swap(x, y);

		System.out.println("x=" + x + " y=" + y);

		int a[] = {0, 1, 2, 3, 4, 5};

		swap(a, 2, 5);
		System.out.println("a[2]=" + a[2] + " a[5]=" + a[5]);

	}
}