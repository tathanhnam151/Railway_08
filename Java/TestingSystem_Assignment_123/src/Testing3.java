import java.util.Arrays;

public class Testing3 {
	public static void main(String[] args) {
		question1();
		question2();
		question3();
			}

	// Question 1:
	public static void question1() {
		float Account1 = 5240.5f;
		float Account2 = 10970.055f;
		int Account1lamtron = (int) Account1;
		int Account2lamtron = (int) Account2;
		System.out.println("Account 1: " + Account1lamtron + " $");
		System.out.println("Account 2: " + Account2lamtron + " $");
	}

	// Question 2:
	public static void question2() {
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].email = "Email " + i;
			accounts[i].username = "Username " + i;
			accounts[i].fullName = "Fullname " + i;
		}
	}

	// Question 15
	public static void question3() {
		String s1 = " I am developer ";
		String str = s1.trim();
		String revert = "";
		String[] strsplit = str.split(" ");
		for (int i = strsplit.length - 1; i >= 0; i--) {
			if (i != 0) {
				revert += strsplit[i] + " ";
			} else
				revert += strsplit[i];
		}
		System.out.println(revert);
	}

	//Revert
	public static String revertString(String input) {
		
		String str = input.trim();
		String revert = "";
		String[] strsplit = str.split(" ");
		for (int i = strsplit.length - 1; i >= 0; i--) {
			if (i != 0) {
				revert += strsplit[i] + " ";
			} else
				revert += strsplit[i];
		}
		return revert;
	//	System.out.println(revert);
	}
}


