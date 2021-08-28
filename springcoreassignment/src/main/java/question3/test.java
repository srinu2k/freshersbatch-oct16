package question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("core3.xml");
		Bankacc_controllerclass contr= (Bankacc_controllerclass) con.getBean("controller");
		System.out.println(contr.getBalance(125));
		System.out.println(contr.withdraw(450, 500000));
		System.out.println(contr.deposit(450, 500000));
		System.out.println(contr.fundTransfer(125, 965, 2000));
		System.out.println(contr.getBalance(125));
		
	}
}
