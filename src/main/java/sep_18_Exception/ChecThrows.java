package sep_18_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ChecThrows {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, InterruptedException,ArithmeticException  {
	Class c1 = Class.forName("java.lang.String");
	Thread.sleep(0);int a=50,b=0;
	int f;
	f=a/b;
	System.out.println(f);
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/chintu", "root", "chintu"); 
	FileReader fileReader = new FileReader("./target/Test.txt"); 
	
		
	
}
	

}
