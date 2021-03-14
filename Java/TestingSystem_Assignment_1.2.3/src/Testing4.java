import java.util.Scanner;

public class Testing4 {
	public static void main(String[] args) {
//	question1();
//	question2();
	question3();
	}
	
	// Q1
	public static void question1() {
		String s1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap chuoi: ");
		s1 = scanner.nextLine();

		String[] words = s1.split(" ");
		System.out.println("So ky tu: " + words.length);

		scanner.close();
	}
	
	// Q2
	public static void question2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap chuoi 1: ");
		String s1 = scanner.nextLine();

		System.out.println("Nhap chuoi 2: ");
		String s2 = scanner.nextLine();

		System.out.println("Chuoi moi : " + s1.concat(s2));

		scanner.close();
	}
	
	// Q3
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		String name;

		System.out.println("Nhap ten: ");
		name = scanner.nextLine();

		String firstCharacter = name.substring(0, 1).toUpperCase();

		String leftCharacter = name.substring(1);

		name = firstCharacter + leftCharacter;

		System.out.println(name);

		scanner.close();
	}
}
