package day2_java_assignment;

public class Assign2Q4 
{	
	public static void main (String[] args) 
	{
		Employee employee=new CommissionEmployee(121, "amit", 2.1, 2000000);
		System.out.println(employee.getPayment());
	}
}