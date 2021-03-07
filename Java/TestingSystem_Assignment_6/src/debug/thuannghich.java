package debug;



public class thuannghich {
	public String thuanNghich(int x) {
		String result = null;
		String result1 = null;
		while (x > 0) {
			String digit = String.valueOf(x % 10);
			result1 = result + digit;
		}
	
		return result1;
	}
	
	public static void main(String[] args) {
		int x = 123456;
		String result = "";
		String result1 = "";
		while (x > 0) {
			String digit = String.valueOf(x % 10);
			x = (x / 10);
			result1 = result + digit;
			
		}
		System.out.println(result1);
	
}
}
