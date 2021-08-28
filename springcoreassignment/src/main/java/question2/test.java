package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("core2.xml");
		question q= (question) con.getBean("question");
		System.out.println(q);
	}

}