package entities;

public class Salario {
	private int id;
	private String name;
	private double salary;
	
	public Salario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double addSalary(double percetual) {
		return salary += salary * percetual/100.0;
	}
	
	public String toString() {
		return "id= " + id +" ,Nome= "+ name+" ,Salario= " +String.format("%.2f", salary)  ;
	}

}
