package frontend;

import java.sql.SQLException;

//import backend.Exercise2;
import backend.Exercise2_2;
import backend.Exercise2_3;
import backend.Exercise2_4;

public class Program2 {
	public static void main(String[] args) throws Exception {
//		Exercise2 ex = new Exercise2();
//		ex.getGroup();
//		Exercise2_2 ex2 = new Exercise2_2();
//		ex2.getGroup();
//		Exercise2_3 ex3 = new Exercise2_3();
//		ex3.getGroup();
		Exercise2_4 ex4 = new Exercise2_4();
		System.out.println(ex4.isGroupNameExists("'Java Fresher'"));
	}
}
