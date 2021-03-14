package entity.part1;

public class Question2 {

	public static void conversion(int sec) {
		int hour;
		int min;
		
		min = sec / 60;
		sec = sec % 60;
		hour = min / 60;
		min = min % 60 ;
		System.out.println(	(""+(100 + hour)).substring(1) + ":" + 
							(""+(100 + min)).substring(1) + ":" + 
							(""+(100 + sec)).substring(1));
	}
}
