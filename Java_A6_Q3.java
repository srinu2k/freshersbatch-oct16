import java.util.*;
class Employ implements Comparable<Employ>
{
	private int id;
	private String name;
	private String dept;
	private int salary;
	public Employ(int id, String name, String dept, int salary) 
	{
		super();
		this.id = id;
		this.name = name;
		
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public String getDept() 
	{
		return dept;
	}
	public int getSalary() 
	{
		return salary;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employ e) 
	{
		int ret= this.id-e.id;
		if(ret==0) {
			ret= this.name.compareTo(e.name);
		}
		if(ret==0)
			ret= this.dept.compareTo(e.dept);
		if(ret==0)
			ret= this.salary-e.salary;
		return ret;
	}
}
class IdComparator implements Comparator<Employ>
{
	public int compare(Employ e1, Employ e2) 
	{
		return e1.getId()-e2.getId();
	}
}
class NameComparator implements Comparator<Employ>
{
	public int compare(Employ e1, Employ e2) 
	{
		int ret= e1.getName().compareTo(e2.getName());
		if(ret==0)
			ret= e1.getId()-e2.getId();
		return ret;
	}
}
class DeptComparator implements Comparator<Employ>
{
	public int compare(Employ e1, Employ e2) 
	{
		int ret= e1.getDept().compareTo(e2.getDept());
		if(ret==0)
			ret= e1.getId()-e2.getId();
		return ret;
	}
}
class SalaryComparator implements Comparator<Employ>
{
	public int compare(Employ e1, Employ e2) 
	{
		int ret= e1.getSalary()-e2.getSalary();
		if(ret==0)
			ret= e1.getId()-e2.getId();
		return ret;
	}
}
public class Java_A6_Q3
{
	public static void main(String[] args) 
	{
		Set<Employ> set;
		Scanner sc= new Scanner(System.in);
		System.out.println("a) ID\tb) Name\tc) Department\td) Salary");
		String c= sc.next();	
		if(c.compareTo("a")==0)
			set= new TreeSet<>(new IdComparator());
		else if(c.compareTo("b")==0)
			set= new TreeSet<>(new NameComparator());
		else if(c.compareTo("c")==0)
			set= new TreeSet<>(new DeptComparator());
		else if(c.compareTo("d")==0)
			set= new TreeSet<>(new SalaryComparator());
		else 
		{
			System.out.println("Invalid Option!! Creating default set\n");
			set= new TreeSet<>();
		}
		set.add(new Employ(121, "Damon", "Vampire", 2000000));
		set.add(new Employ(54, "Stefan", "Vampire", 4500000));
		set.add(new Employ(26, "Klaus", "Hybrid", 10000000));
		set.add(new Employ(36, "Katherine", "Evil Vampire", 3800000));
		set.add(new Employ(46, "Bonnie", "Witch magic", 4500000));
		set.add(new Employ(32, "Caroline", "Vampire", 6500000));
		set.add(new Employ(81, "Elijah", "Original", 7800000));
		set.add(new Employ(16, "Enzo", "Vampire", 2150000));
		set.add(new Employ(46, "Rebekah", "Original", 3540000));
		set.add(new Employ(46, "Hayley", "Wolf", 6800000));
		for(Employ e: set)
			System.out.println(e);
		sc.close();
	}
}