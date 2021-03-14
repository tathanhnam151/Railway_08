package mains;

public class Question1a {
	public static void main(String[] args) {
		int input = 8;
		int line = 0;

		while (line < input) {
			for (int i = 1; i <= line + 1; i++) {
				System.out.print(input + " ");
			}
			System.out.println();
			line++;
		}
	}
}
