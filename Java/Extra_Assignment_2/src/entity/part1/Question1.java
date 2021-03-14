package entity.part1;

import java.text.DecimalFormat;

public class Question1 {

	public static void convert(double input) {
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println(input + " cm = " + df.format((double) (input / 2.54)) + " inches");
		System.out.println(input + " cm = " + df.format((double) ((input / 2.54) / 12)) + " foot");
	}
}
