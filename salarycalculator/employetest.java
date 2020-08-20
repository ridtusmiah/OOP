/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

import java.util.Scanner;

/**
 *
 * @author Ridwan Tusmiah
 */
  public class employetest 
{
  private String FirstName;
  private String LastName;
  private double MonthlySalary;

  public employetest (String FirstName, String LastName, double MonthlySalary)
  {
    this.FirstName = FirstName;
    this.LastName = LastName;
    
    if(MonthlySalary > 0)
   this.MonthlySalary = MonthlySalary;

  if(MonthlySalary < 0)
  this.MonthlySalary = 0.0;
   
  }



  public void setFirstName (String firstName)
  {
    this.FirstName = FirstName;
  }

  public String getFirstName ()
  {
    return FirstName;
  }

  public void setLastName (String last)
  {
    this.LastName = LastName;
  }

  public String getLastName ()
  {
    return LastName;
  }

  public void setMonthlySalary (double salary)
  {
    if ( MonthlySalary < 0 )
       this.MonthlySalary = 0;
    else 
       this.MonthlySalary = MonthlySalary;
  }

  public double getMonthlySalary ()
  {
    return MonthlySalary;
  }
    public void setMonthlySalaryafter (double salary)
  {
    if ( MonthlySalary < 0 )
       this.MonthlySalary = 0;
    else 
       this.MonthlySalary = MonthlySalary;
  }
    public double getMonthlySalaryafter ()
  {
    return MonthlySalary+(MonthlySalary/100*10);
  }
  
}



    

