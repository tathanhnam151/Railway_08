import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InputFromConsole {
	public static void main(String[] args) throws ParseException {
		
		Scanner scanner = new Scanner(System.in);
		
		// Q1
		System.out.println("Moi ban nhap vao 3 so nguyen");
		for (int i = 0; i < 3; i++) {
			int x = scanner.nextInt();
			System.out.println("So da nhap: " + x + "\n");
		}
		
		// Q2
		System.out.println("Moi ban nhap vao 2 so thuc");
		for (int i = 0; i < 2; i++) {
			double x = scanner.nextDouble();
			System.out.println("So da nhap: " + x + "\n");
		}
		
		// Q3
		System.out.println("Moi ban nhap ho");
		String s1 = scanner.next();
		System.out.println("Moi ban nhap ten");
		String s2 = scanner.next();
		System.out.println("Ho va ten da nhap: " + s1 + " " + s2 + "\n");
		
		// Q4
		System.out.println("Moi nhap vao ngay sinh");
		String dob = scanner.next();
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dob);
		System.out.println("Ngay sinh: " + date);
		
		// Q7
		System.out.println("Moi ban nhap vao 1 so chan");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("So da nhap " + number);
		} else {
			System.out.println("So " + number + " " + "khong phai la so chan");
		}
			
		// Q8
		
		
	}
}
