import java.util.*;
class Employees
{
	int id;
	String name;
	long salary;
	String department;
	public Employees(int id, String name, long salary, String department) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
}
public class Java_A5_Q1 
{
	public static void main(String[] args) 
	{
		Set<Employees> set= new HashSet<>();
		set.add(new Employees(1,"Damon", 6000000,"Vampire"));
		set.add(new Employees(2,"Klaus", 2000000,"Hybrid"));
		set.add(new Employees(3,"Bonnie", 3600000,"Magic"));	
		set.add(new Employees(3,"Matt", 3600000,"Human"));
		Iterator<Employees> i= set.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}