package entity.part2;

import java.util.ArrayList;

public class Exercise1 {
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public void them() {
		for (int i = 0; i < 9; i++) {
			nums.add(i);
			
		}
		nums.add(3);
		nums.add(7);
	}
	
	public void doIt() {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			int x = nums.get(i);
			for (int y = 0; y < nums.size(); y++) {
				if (nums.get(y) == x) {
					count++;
				} 
			} if (count == 1) {
				result.add(nums.get(i));
			}
		}
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
} 
