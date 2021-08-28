package javax.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import question8.customer;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext con= new ClassPathXmlApplicationContext("core8.xml");
		con.registerShutdownHook();
		customer cus= (customer) con.getBean("customer");
		System.out.println(cus);
	}

}