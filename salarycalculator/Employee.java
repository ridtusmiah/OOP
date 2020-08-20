/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author Ridwan Tusmiah
 */
public class Employee{
 private String firstName;
 private String fullname;
 private String lastName;
 private double monthlySalary;
 
 public Employee(){
  firstName=null;
  lastName=null;
  monthlySalary=0.0;
 }
 
  public String getfirstName(){
   return firstName;
   }
  public String getlastName(){
   return lastName;
   }
  public double getSalary(){
       if(monthlySalary > 0) 
   return monthlySalary;
   if(monthlySalary < 0)   this.monthlySalary = 0.0; 
     return 0;

   }
   
   public void setfirstName(String first){
    firstName = first;
    }
   public void setlastName(String last){
    lastName = last;
    }
   public void setSalary(double salary){
    monthlySalary = salary;
    }
   }

    

