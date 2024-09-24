package sep_21_FunctionInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeData {
	public static void main(String[] args) {
		List<Employe> emp = new ArrayList<Employe>();
		Date ramJD = new Date();
		ramJD.setYear(2015);
		ramJD.setMonth(5);
		ramJD.setDate(21);
		Date saiJD = new Date();
		saiJD.setYear(2013);
		saiJD.setMonth(6);
		saiJD.setDate(31);
		Date narendraJD = new Date();
		narendraJD.setMonth(1);
		narendraJD.setDate(1);
		narendraJD.setYear(2019);
		Date gethaJD = new Date();
		gethaJD.setMonth(10);
		gethaJD.setDate(21);
		gethaJD.setYear(2019);
		Date natashaJD = new Date();
		natashaJD.setMonth(10);
		natashaJD.setDate(21);
		natashaJD.setYear(2019);
		emp.add(new Employe("ram", "dev", ramJD, 250000, 35, 'm'));
		emp.add(new Employe("sai", "dev", saiJD, 750000, 35, 'm'));
		emp.add(new Employe("narendra", "tester", narendraJD, 188568, 28, 'm'));
		emp.add(new Employe("getha", "suport", gethaJD, 450000, 25, 'f'));
		emp.add(new Employe("natasha", "ceo", natashaJD, 1550000, 52, 'f'));
		// Write a query to retrieve all employee records from the employees table.
		System.out.println("*******all employee records*******");
		emp.stream().collect(Collectors.toList()).forEach(t -> System.out.println(t));
		System.out.println();
		// Write a query to fetch the first name, job title, and salary of all employees
		System.out.println("*********first name, job title, and salary of all employees*********");
		emp.stream().map(t -> t.getName() + " " + t.getDept() + " " + t.getSal()).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to find all employees whose job title is 'dev'.
		System.out.println("**********all employees whose job title is 'dev'********");
		emp.stream().filter(t -> t.getDept().equalsIgnoreCase("dev")).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to find all employees who are male ('m') and have a salary greater than 500,000.
		System.out.println("****all employees who are male and have a salary greater than 500,000.*********");
		emp.stream().filter(t -> t.getGender() == 'm' && t.getSal() > 500000).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to find all female employees ('f').
		System.out.println("all female employees");
		emp.stream().filter(t -> t.getGender() == 'f').map(t -> t.getName() + " " + t.getGender())
				.collect(Collectors.toList()).forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to sort all employees by their salary in descending order.
		System.out.println("all employees by their salary in descending order");
		emp.stream().sorted(Comparator.comparing(Employe::getSal).reversed()).map(t -> t.getName() + " " + t.getSal())
				.forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to fetch the top 3 highest-paid employees.
		System.out.println(" top 3 highest-paid employees");
		emp.stream().sorted(Comparator.comparing(Employe::getSal).reversed()).map(t -> t.getName() + " " + t.getSal())
				.limit(3).forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to list employees, sorted by their age in ascending order.
		System.out.println("age in ascending order.");
		emp.stream().sorted(Comparator.comparing(Employe::getAge)).map(t -> t.getName() + " " + t.getAge())
				.forEach(t -> System.out.println(t));
		System.out.println();
//		Write a query to calculate the average salary of all employees.
		System.out.println("average salary of all employees.");
		Double in = emp.stream().collect(Collectors.averagingDouble(Employe::getSal));
		System.out.println(in.doubleValue());
		System.out.println();
		// Write a query to find the total number of employees
		System.out.println("the total number of employees");
		Long ecount = emp.stream().count();
		System.out.println(ecount);
		System.out.println();
//		Write a query to find the total number of employees for each job title.
//		System.out.println("total number of employees for each job title.");
//		Set<String> ecount1 =emp.stream().Co
//		System.out.println(ecount1);
//		Write a query to find the maximum and minimum salary in the company.
		Optional<Employe> maxsal = emp.stream().max(Comparator.comparingDouble(Employe::getSal));
		System.out.println(maxsal.get().getSal());
		Optional<Employe> maxsalq = emp.stream().min(Comparator.comparingDouble(Employe::getSal));
		System.out.println(maxsalq.get().getSal());
	}

}
