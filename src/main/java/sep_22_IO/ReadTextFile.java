package sep_22_IO;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadTextFile {
	public void propertiesFill() throws Exception {
		String path = "./target/prasad.properties";
		File f= new File(path);
		FileInputStream fis =new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		prop.forEach((key, value) -> {
		        System.out.println(key + " = " + value);
		    });
		System.out.println();
	}
	
	public void excelfile() throws Exception {
		String path = "./target/ram.xls";
		File f= new File(path);
		FileInputStream fis =new FileInputStream(f);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet  sheet=wb.getSheet("employee");
		Iterator<Row> rowIterator = sheet.iterator();
	    while (rowIterator.hasNext()) {
	        Row row = rowIterator.next();
	        Iterator<Cell> cellIterator = row.iterator();
	        while (cellIterator.hasNext()) {
	            Cell cell = cellIterator.next();
	            String cellValue = cell.toString(); 
	            System.out.print(cellValue + "\t"); 
	        }
	     System.out.println();
	    }
System.out.println();
	}
	public void textfile() throws Exception {
		String path = "./target/hi.txt";
		File f= new File(path);
		FileInputStream fis =new FileInputStream(f);
		byte[] b= new byte[fis.available()];
		fis.read(b);
		 String data= new String(b);
		 System.out.println(data);
	}

	public static void main(String[] args) throws Exception {
		ReadTextFile rtf= new ReadTextFile();
		rtf.excelfile();
		rtf.propertiesFill();
		rtf.textfile();
	}

}
