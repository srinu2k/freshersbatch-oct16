import java.util.*;
class Contact{
	private String name;
	private long phoneNo;
	private String email;
	private String gender;
	public Contact(String name, long phoneNo, String email, String gender) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender= gender;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", gender=" + gender + "]";
	}
}
public class Java_A6_Q1 
{
	public static void main(String[] args)
	{
		Map<Long, Contact> map= new TreeMap<>(Collections.reverseOrder());
		map.put(9963868705L, new Contact("Damon", 9963868705L, "damon@tvd.com","Male"));
		map.put(8491567705L, new Contact("Stefan", 8491567705L, "stefan@tvd.com","Male"));
		map.put(9876548705L, new Contact("Klaus", 9876548705L, "niklaus@originals.com","Male"));
		map.put(7454464864L, new Contact("Hayley", 7454464864L, "hayley@wolf.com","Female"));		
		for(Map.Entry<Long, Contact> e: map.entrySet())
			System.out.println(e.getKey()+"\t"+e.getValue());
	}
}