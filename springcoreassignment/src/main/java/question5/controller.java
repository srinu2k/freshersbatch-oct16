package question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class controller {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("core5.xml");
		Customer5 cus= (Customer5) con.getBean("customer5");
		System.out.println(cus);
	}

}
