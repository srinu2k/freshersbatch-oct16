package question5;



import org.springframework.beans.factory.annotation.Required;


public class Customer5 {
	int id;
	
	
	custcontact cc;
	
	@Inject
	Address5 address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address5 getaddress() {
		return address;
	}
	public custcontact getCc() {
		return cc;
	}
	@Required
	public void setCc(custcontact cc) {
		this.cc = cc;
	}
	
	public void setAddress(Address5 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cc=" + cc + ", address=" + address + "]";
	}
	
	
	
	
}
