import java.util.*;
class Employee
{
     String name;
     int salary;
     Employee()
     {
          name = null;
          salary = 0;
     }
     Employee (String name, int salary)
     {
          this.name = name;
          this.salary = salary;
     }
     int getSalary()
     {
          return salary;
     }
}
class Manager extends Employee
{
     int incentive;
     Manager(){
    	 
     }
     Manager(String name, int salary, int incentive)
     {
          super(name, salary);
          this.incentive = incentive;
     }
     int getSalary()
     {
          return (super.getSalary()+incentive);
     }
}
class Labour extends Employee
{
     int overTime;
     Labour()
     {
    	 
     }
     Labour(String name, int salary, int overTime)
     {
          super(name, salary);
          this.overTime= overTime;
     }
     int getSalary()
     {
          return (super.getSalary()+overTime);
     }
}
class Main
{
     public static void main(String[] args)
     {
    	 Scanner in= new Scanner(System.in);
    	 Manager m1 = new Manager();
    	 System.out.println("enter the name, salary and incentive of manager");
    	 m1.name= in.nextLine();
    	 m1.salary= in.nextInt();
    	 m1.incentive= in.nextInt();
    	 System.out.println("Salary of "+m1.name +m1.getSalary());
    	 
         Labour l1 = new Labour();
         System.out.println("enter the name, salary and Overtime of Labour");
         l1.name= in.next();
    	 l1.salary= in.nextInt();
    	 l1.overTime= in.nextInt();
         System.out.println("Salary of "+l1.name  +l1.getSalary());
     }
}
