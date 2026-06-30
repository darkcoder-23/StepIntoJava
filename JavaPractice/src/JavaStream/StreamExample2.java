package JavaStream;

import java.util.*;
import java.util.stream.*;

class Employee {
	private int id;
	private String name;
	private int salary;
	private int age;
	
	Employee(int id, String name, int salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.setAge(age);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "{id=" + id +
				", name=" +name +
				", salary="+ salary +
				", age =" + age +
				"}";
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


public class StreamExample2 {
	public static void main(String[] args) {
		//Given the List of Employee(id,name,salary) and find the sum of all salary.
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"Shayan",10, 24));
		employees.add(new Employee(2,"Shayan1",10, 24));
		employees.add(new Employee(3,"Raza",100,23));
		employees.add(new Employee(4,"Ankit",100,23));
		employees.add(new Employee(5,"Kumar",99,23));
		employees.add(new Employee(6,"Anand",99,25));
		employees.add(new Employee(7,"Diynashu",100,25));
		employees.add(new Employee(8,"Rahul",10000,28));
		employees.add(new Employee(9,"Gupta",8000,28));
		System.out.println(employees);
		
		List<String> empNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Name of Emp - " + empNames);
		
		
		List<Integer> empSalary = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
		System.out.println("Salary of Emp - " + empSalary);
		
		
		// Find the sum of all salary of the employee.
		int totalSalary = employees.stream().mapToInt(Employee::getSalary).sum();
		System.out.println("Total Salary of all Employee = "+totalSalary);
		

		List<Integer> ageList = employees.stream().map(Employee::getAge).collect(Collectors.toList());
		System.out.println(ageList);
		
		Map<Integer,List<Employee>> empMap = employees.stream().collect(Collectors.groupingBy(x->x.getAge()));
		System.out.println(empMap);

		// List of employee to group by age and avarage of the salary of that group.		
		Map<Integer,Double> empAgeAvgSal = employees.stream().collect(Collectors.groupingBy(x->x.getAge(), Collectors.averagingInt(x->x.getSalary())));
		System.out.println(empAgeAvgSal);
		
		
		// map Age with name for the employee.
		Map<String,Integer> mapAgeName = employees.stream()
										.collect(Collectors.toMap(
												y->y.getName(),
												x->x.getAge()
												
											));
		System.out.println(mapAgeName);
		
		
		// List of employee top 3 employee whose salary is greater that x
		List<Employee> emp = employees.stream()
		.filter(x->x.getSalary() > 10)
		.limit(3)
		.sorted(Comparator.comparing(Employee::getSalary).reversed())
		.collect(Collectors.toList());
		System.out.println(emp);
		
		// List of employee name and salary whose salary is greater than x.
		List<Employee> topSalaryEmp = employees.stream().filter(x->x.getSalary() > 5).collect(Collectors.toList());
		
		topSalaryEmp.forEach(z->System.out.println(z.getName() + "-->" + z.getSalary()));
		
		
		// Retrive the employee a maximum salry in same age group. 
		
		Map<Integer,Optional<Employee>> empAgeGroup = employees.stream().collect(Collectors.groupingBy(a->a.getAge(), Collectors.maxBy(Comparator.comparingInt(s->s.getSalary()))));
		System.out.println(empAgeGroup);
		empAgeGroup.forEach((x,y)-> System.out.println(x + " " +y.get().getName() + " Max Salay is : "+ y.get().getSalary()));
		
		// Retrive 2nd Highest salary of the same age group.
		//23 ["Ankit",100, "Kumar",99]  - 99
		
		Map<Integer,Optional<Employee>> secondMaxSalary = employees.stream().collect(Collectors.groupingBy(a->a.getAge(), Collectors.collectingAndThen(
				Collectors.toList(), list->list.stream().sorted((a,b)->  b.getSalary() - a.getSalary()).skip(1).findFirst())));
		secondMaxSalary.forEach((x,y) -> {
			System.out.println("Age : "+ x);
			System.out.println("Second Maximum Salary : "+ y.get().getSalary());
			
		});
		
		// Find the number of employee in the each age group.
		Map<Object, Long> numOfEmpEachDepartment = employees.stream()
				                     .collect(Collectors.groupingBy(x->x.getAge() , Collectors.counting()));
		System.out.println("Number of employee in the each age group.");
		System.out.println(numOfEmpEachDepartment);
		
		// Get the Employee Salary based on employee name.
		String searchName = "Raza";
		int searchSalary  = employees.stream()
				      .filter(e->e.getName().equals(searchName))
				      .map(Employee::getSalary).findFirst().get();
		System.out.println("Employee Salary by name is  : " + searchSalary);
		
		// Given a list of employees, find the department having the maximum number of employees using Java 8 Streams
		System.out.println(
			    employees.stream()
			        .collect(Collectors.groupingBy(
			            e -> e.getAge(),
			            Collectors.counting()
			        ))
			        .entrySet()
			        .stream()
			        .max(Map.Entry.comparingByValue())
			        .orElse(null)
			);

		// Merge two Employee ArrayLists and sort them by age using Java 8 Stream API.
		List<Employee> employees1 = employees.subList(0, employees.size()/2);
		List<Employee> employees2 = employees.subList(employees.size()/2, employees.size());

		List<Employee> mergedEmployees =
		        Stream.concat(employees1.stream(), employees2.stream())
		              .sorted(Comparator.comparing(Employee::getAge))
		              .toList();
		mergedEmployees.forEach(e ->
		        System.out.println("Name: " + e.getName() + " Age: " + e.getAge()));


	}

}
