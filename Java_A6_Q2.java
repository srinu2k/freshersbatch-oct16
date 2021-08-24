import java.util.*;
class Product 
{
	private int id;
	private String name;
	private String type;	
	public Product(int id, String name, String type) 
	{
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", Name=" + name + ", type=" + type + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(id, name, type);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}
}
public class Java_A6_Q2 
{
	public static void main(String[] args) 
	{
		Set<Product> set= new HashSet<>();
		set.add(new Product(121, "WII", "Game console"));
		set.add(new Product(254, "Panasonic", "Electronics"));
		set.add(new Product(549, "HE_GROOMING", "Cosmetics"));
		set.add(new Product(549, "HE_GROOMING", "Cosmetics"));
		set.add(new Product(121, "WII", "Game console"));
		set.add(new Product(549, "HE_GROOMING", "Cosmetics"));
		
		for(Product p: set)
			System.out.println(p);
	}
}