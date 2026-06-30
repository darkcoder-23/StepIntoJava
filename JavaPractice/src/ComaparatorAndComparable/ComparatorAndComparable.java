package ComaparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorAndComparable  {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(4,"Shayan",25);
		Employee e2 = new Employee(3,"Ankit",23);
		Employee e3 = new Employee(2,"Anand",24);
		Employee e4 = new Employee(1,"Rahul",28);
		
		List<Employee> employees = new ArrayList<>();
		
//		System.out.println(e1.compareTo(e2));
//		System.out.println(e3.compareTo(e4));
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		//Collections.sort(employees);
		
		Collections.sort(employees, (a,b) -> {
			return a.getAge() - b.getAge();
			
		});
		System.out.println("Sort the List on the basis of Age");
		print(employees);
		
		Collections.sort(employees, (a,b)->{
			return a.getId()-b.getId();
			
		});
		
		System.out.println("Sort the List on the basis of Id");
		
		print(employees);
		
	}

	private static void print(List<Employee> employees) {
		for(Employee emp : employees) {
		    System.out.println("Id : " + emp.getId() + ",Name : " + emp.getName() + ", Age : " + emp.getAge());
		}
		
	}
}
