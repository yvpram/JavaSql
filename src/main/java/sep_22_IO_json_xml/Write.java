package sep_22_IO_json_xml;

import java.io.File;
import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Write {
	public void jsonWrite(String name,int num) throws Exception {
		String path = "./target/" + "prasad" + ".json";
		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file);
		ObjectMapper mapper = new ObjectMapper();
		Student stu = new Student();
		stu.setName(name);
		stu.setRollnum(num);
		mapper.writeValue(file, stu);
		fos.close();
	}
	public void xmlWrite(Student student) throws JAXBException  {
		String path = "./target/" + "prasad" + ".xml";
		File file = new File(path);
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		 Marshaller marshaller = jaxbContext.createMarshaller();
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		 marshaller.marshal(student, file);
		 System.out.println("XML file created successfully at " + path);
	}

	public static void main(String[] args) throws Exception  {
		Write w = new Write();
		w.jsonWrite("qwer", 231);
		
		Student student = new Student("Prasad", 101);
		w.xmlWrite(student);
	}
}
