
package salary;

/**
 *
 * @author Ridwan Tusmiah
 */
import java.util.Scanner;
public class EmployeeTest{
 public static void main( String args[] ){
  Employee e1=new Employee();
  Employee e2=new Employee();

  Scanner sc=new Scanner(System.in);
  String first;
  String last;
  double salary;
  System.out.println( "\n\t\t\tEmployee One\n\t\t\t ");
  System.out.println("Enter First Name: ");
  first=sc.next();
  e1.setfirstName(first);

  System.out.println("Enter Last Name: ");
  last=sc.next();
  e1.setlastName(last);

  System.out.println( "Enter Monthly Salary: " );
  salary=sc.nextDouble();
  e1.setSalary(salary);
    System.out.println( "\n\t\t\tEmployee Two\n\t\t\t ");
  System.out.println("Enter First Name: ");
  first=sc.next();
  e2.setfirstName(first);

  System.out.println("Enter Last Name: ");
  last=sc.next();
  e2.setlastName(last);

  System.out.println( "Enter Monthly Salary: " );
  salary=sc.nextDouble();
  e2.setSalary(salary);
  
   System.out.println( "\n\t\t\tEmployeeR One Name & Salary\n\t\t\t ");
  System.out.println( e1.getfirstName() +  " " + e1.getlastName() + " " + e1.getSalary() * 12 + "\n" );
  
  System.out.println( "\n\t\t\tEmployee Two Name & Salary\n\t\t\t ");
  System.out.println( e2.getfirstName() + " " + e2.getlastName() + "  " + e2.getSalary() * 12 + "\n" );

  System.out.println("New Total Annual Salary After 10% Raise.\n");
  System.out.println(e1.getfirstName() + " " + e1.getlastName() + "  " + (e1.getSalary()*1.10 * 12 + "\n"));
  System.out.println( e2.getfirstName() + " " + e2.getlastName() + "  " + (e2.getSalary()*1.10 * 12 + "\n"));
  }
}
