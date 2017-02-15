class Program {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 6;
		a[2] = -3;
		a[3] = 5;
		a[4] = 7;

		/**
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		**/

		/**
		int i = 0;
		while (i < 5) {
			System.out.println(a[i]);
			i++; // i = i+1;
		}
		**/

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("---------");
		int x = 7;

		int y = x;
		y = 6;
		System.out.println(y); // 7
		System.out.println("---------");

		int b[] = a;
		b[2] = 10;
		System.out.println(a[2]);
	}
}