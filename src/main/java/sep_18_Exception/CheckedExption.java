package sep_18_Exception;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;



public class CheckedExption {
	class Abc{
		
	}
	public static void main(String[] args)  {
		try {
			Class.forName("String");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection connectionpu=DriverManager.getConnection("jdbc:mysql://localhost:3306/chintu", "ram", "chintu"); 
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			  FileReader fileReader = new FileReader("Test.txt");  
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
