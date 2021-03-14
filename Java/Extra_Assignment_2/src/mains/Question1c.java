package mains;

public class Question1c {

	public static void main(String[] args) {
		int input = 9;
		int line = 9;
		int line1 = 1;

		while (line > 0) {
			for (int i = line - 2; i >= 0; i--) {
				System.out.print(" " + " ");
			}
			for (int i = 0; i < line1; i++) {
			System.out.print(input + " ");
			}
			line1++;
			System.out.println();
			line--;
		}
	}
}
