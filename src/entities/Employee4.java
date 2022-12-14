package entities;

public class Employee4 {
	
	private String name;
	private String email;
	private Double salary;
	
	public Employee4() {	
	
	}
	public Employee4(String name, String email, Double salary) {	
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee4 [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	

}
