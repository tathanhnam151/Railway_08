package entity.part2;

import java.util.ArrayList;

public class Exercise2 {
	private ArrayList<Integer> nums = new ArrayList<Integer>();

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
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> result1 = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			int count = 1;
			for (int z = 0; z < result.size(); z++) {
				if (nums.get(i) == result.get(z)) {
					count++;
				}
			}
			if (count == 1) {
				result.add(nums.get(i));
			}
			
			if (count == 2) {
				result1.add(nums.get(i));
			}
		}
		
		for (int num : result1) {
			System.out.println(num + " ");
		}
	}
}