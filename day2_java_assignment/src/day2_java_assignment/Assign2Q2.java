package day2_java_assignment;

public class Assign2Q2 
{
	public static void main(String[] args) 
	{
		BookStore bookStore=new BookStore("harman", 5);
		bookStore.sell("spring in action", 2);
		bookStore.display();
	}
}