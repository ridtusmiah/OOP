/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice2;
  import java.util.Scanner;
/**
 *
 * @author Ridwan Tusmiah
 */
public class setinfo {
  
public static void main(String[] args) {        
    int quantity;
    double price;
    double invoiceAmount;       
    Invoice invoice1 = new Invoice("1234","Hammer",-5, -10.00);     
    Scanner keyboard = new Scanner (System.in);     
    System.out.printf( "Part number: %s\n", invoice1.getPartNumber());
    System.out.printf( "Part Description: %s\n", invoice1.getPartDescription());
    System.out.printf( "Quantity: %s\n", invoice1.getQuantity());
    System.out.printf( "Price: %s\n", invoice1.getPrice());
    System.out.printf( "Price: %s\n", invoice1.getInvoiceAmount());
 }
}

