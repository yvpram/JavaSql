package sep_22_IO_json_xml;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String name;
	private int rollnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnum=" + rollnum + "]";
	}
	public Student(String name, int rollnum) {
		super();
		this.name = name;
		this.rollnum = rollnum;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
