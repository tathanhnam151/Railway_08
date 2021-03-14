package entity.part2;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise4 {
	public void sumDigit(int input) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		
		int num = input;
		
		while (num > 0) {
			int x = (num%10);
			num = (num/10);
			digits.add(x);
		}
		
		int sum = 0;
		
		for (int i = 0; i < digits.size(); i++) {
			sum += digits.get(i);
		}
		
		Collections.reverse(digits);
			System.out.println("So " + input + " co tong cac chu so la: ");
		for (int i = 0; i < digits.size() - 1; i++) {
			System.out.print(digits.get(i) + "+");
		}
		System.out.print(digits.get(digits.size() - 1) + "=" + sum);
		
	}
}
