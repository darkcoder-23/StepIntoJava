package ComaparatorAndComparable;

public class Employee implements Comparable {

	public int id;
	public String name;
	public int age;
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(int age) {
		this.age=age;
	}
	
	

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if(this.getId() == e.getId()) {
			return 0;
		} else if(this.getId() > e.getId()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
