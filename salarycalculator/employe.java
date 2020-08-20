
package salary;

/**
 *
 * @author Ridwan Tusmiah
 */
 public class employe 
{
    public static void main (String [] args)
    {
        employetest employee1 = new employetest ( " Ridwan ", " Tusmiah ", -30000.00 );
        employetest employee2 = new employetest ( " Anindita ", " Das ", 20000.00);

        System.out.println( "Employee1:   " + employee1.getFirstName() + employee1.getLastName()  );//Displays employee1 name
        System.out.println( " Salary: $ " + employee1.getMonthlySalary ()  );//Displays initial yearly salary

        System.out.println( "Employee2:  " + employee2.getFirstName () + employee2.getLastName()  );//Displays employee2 name
        System.out.println( " Salary: $ " + employee2.getMonthlySalary ()  );//Displays initial yearly salary    

        System.out.println( "\n\t\t\tSalary After 10% Raise\n\t\t\t");//Banner to separate initial salary from 10% raised salary

        System.out.println( "Employee1:  " + employee1.getFirstName() +employee1.getLastName()  );//Displays employee1 name
        System.out.println( "Salary :  " + employee1.getMonthlySalaryafter()  );//Displays yearly salary after the 10% increase

        System.out.println( "Employee2:  " + employee2.getFirstName() +employee2.getLastName()  );//Displays employee2 name
        System.out.println( "Salary :  " +  employee2.getMonthlySalaryafter() );//Displays yearly salary after the 10% increase
    }
    
    
}
