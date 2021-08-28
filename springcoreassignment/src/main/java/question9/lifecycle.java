package question9;
public class lifecycle {
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	void init() {
		System.out.println("Bean initialized");
	}
	void destory() {
		System.out.println("Bean destroyed");
	}
}