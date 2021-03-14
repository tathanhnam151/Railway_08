package entity.part1;

public class Question3 {
	
	public static void maxmin(int a, int b, int c, int d) {
		int[] nums = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = c;
		nums[3] = d;
		int max = a;
		int min = a;
		
		for (int num : nums) {
			if (num < min) {
				min = num;
			}
			
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("Trong 4 so: " + a + ", " + b + ", " + c + ", " + d + ": ");
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
	}
}
