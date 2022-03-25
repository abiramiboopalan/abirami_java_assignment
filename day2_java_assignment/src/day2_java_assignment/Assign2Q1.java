package day2_java_assignment;

public class Assign2Q1 {
	public static void main(String[] args) {
	Employee employee=new employee(1, "raj", "gupta", 50000);
	
	((Employee) employee).raiseSalary(10);
	System.out.println(employee);
}
}