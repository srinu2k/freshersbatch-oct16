package quesion10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("core10.xml");
		customer cus= (customer) con.getBean("customer");
		System.out.println(cus);
	}

}
