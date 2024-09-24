package sep_22_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class WritenFile {
	public void propertyFile() throws Exception {
String data= "prasad";
		
		String path = "./target/"+data+".properties";
	
		File file= new File(path);
		FileOutputStream fos= new FileOutputStream(file);
		Properties po= new Properties();
		
		po.setProperty("subject", "pages");
		po.setProperty("sql", "50");
		po.setProperty("java", "250");
		po.store(fos, "by ram");

	}
	
	
	public void excelfile() throws Exception {
		String data= "prasad";
		
		String path = "./target/"+data+".xls";
		File file= new File(path);
		FileOutputStream fos= new FileOutputStream(file);
		Workbook wb = new HSSFWorkbook();
        Sheet s=wb.createSheet("employee");
        s.createRow(0).createCell(0).setCellValue("subject");
        s.getRow(0).createCell(1).setCellValue("SQL");
        s.getRow(0).createCell(2).setCellValue("Java");
        s.getRow(0).createCell(3).setCellValue("Selenium");

        // Creating second row (Row 1)
        s.createRow(1).createCell(0).setCellValue("pages");
        s.getRow(1).createCell(1).setCellValue("50");
        s.getRow(1).createCell(2).setCellValue("250");
        s.getRow(1).createCell(3).setCellValue("180");

        wb.write(fos);
        System.out.println(" excel data enter");
        wb.close();
        fos.close();
         

	}
	
	public void textfile() throws Exception {
		String data= "hi ram ";
		String data1[]= data.split(" ");
		String path = "./target/"+data1[0]+".txt";
		File file= new File(path);
		FileOutputStream fos= new FileOutputStream(file);
		fos.write(data.getBytes());
		System.out.println("writen data");
		fos.close();
	}

	public static void main(String[] args) throws Throwable {
		WritenFile wf= new WritenFile();
		wf.textfile();
	}
}
