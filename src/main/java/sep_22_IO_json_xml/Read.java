package sep_22_IO_json_xml;

import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Read {
	
	public void jsonread(String path) throws Exception, DatabindException, IOException {
		ObjectMapper objmap= new ObjectMapper();
		Student studit= objmap.readValue(Paths.get(path).toFile(), Student.class);
		System.out.println(studit.getName());
		System.out.println(studit.getRollnum());
	}
	
	public void xmlRead(String path1) throws Exception, DatabindException, IOException {
		ObjectMapper objmap= new XmlMapper();
		Student studit= objmap.readValue(Paths.get(path1).toFile(), Student.class);
		System.out.println(studit.getName());
		System.out.println(studit.getRollnum());

	}

	public static void main(String[] args) throws Exception, IOException, Exception {
		Read r= new Read();
		String path="./target/prasad.json";
		String path1="./target/prasad.xml";
		r.jsonread(path);
		System.out.println();
		r.xmlRead(path1);
	}

}
