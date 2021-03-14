package entity.part1;

public class Question4 {
	public static void subtract(int a, int b) {
		int result = (a - b);
		if (result > 0) {
			System.out.println("So thu nhat lon hon so thu hai.");
		} else if (result < 0) {
			System.out.println("So thu hai lon hon so thu nhat.");
		} else 
			System.out.println("Hai so bang nhau.");
	}
}
