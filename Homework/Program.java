import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int count = 0;
		int i = 0;

		a = scanner.nextInt();
		i++; // i = i + 1

		while (a != -999) {
			if (i % 10 == 6) {
				count++;
			}
			a = scanner.nextInt();
			i++;
		}

		System.out.println(count);

	}
}