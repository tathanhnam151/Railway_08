package entity.part1;

public class Question5 {
	public static void chiaHet(int a, int b) {
		if (a % b != 0) {
			System.out.println(a + " khong chia het cho " + b + ".");
			System.out.println(a + " : " + b + " = " + (a / b) + " du " + (a % b) + ".");
		} else {
			System.out.println(a + " chia het cho " + b);
			System.out.println(a + " : " + b + " = " + (a / b) + ".");
		}
	}

}
