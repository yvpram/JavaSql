package sep_21_FunctionInterfaces;



import java.util.Date;

import org.apache.poi.hwpf.usermodel.DateAndTime;

public class Employe {
	private String name;
	private String dept;
	private Date date;
	private float sal;
	private int age;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Employe(String name, String dept, Date joiningDate, float sal, int age, char gender) {
		super();
		this.name = name;
		this.dept = dept;
		this.date = joiningDate;
		this.sal = sal;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", dept=" + dept + ", date=" + date + ", sal=" + sal + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
