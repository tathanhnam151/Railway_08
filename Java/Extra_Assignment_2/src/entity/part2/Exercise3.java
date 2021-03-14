package entity.part2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise3 {
	private Set<Integer> nums = new HashSet<Integer>();
	
	public void them() {
		for (int i = 0; i < 9; i++) {
			nums.add(i);

		}
		nums.add(3);
		nums.add(7);
	}

	public void them1() {
		for (int i = 0; i < 9; i++) {
			nums.add(i);

		}
		nums.add(3);
		nums.add(7);
		for (int i = 0; i < 9; i++) {
			nums.add(i);

		}
		nums.add(3);
		nums.add(7);
	}
	
	public void doIt() {
		for (int num : nums) {
			System.out.println(num + ": " + Collections.frequency(nums, num));
		}
	}
}
