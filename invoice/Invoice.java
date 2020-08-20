package invoice2;

public class Invoice {  
private String partNumber;
private String partDescription;
private int quantity;
private double priceperitem;
private double amount;  
public Invoice(String number, String partDescription, int quantity, double price)
{       
        this.partNumber = number;
        this.partDescription = partDescription;
       
        
        if(price > 0.0)
            this.quantity = quantity;           
        if(price < 0.0)
            quantity = 0;
       
        
        
        
        if(price > 0.0)
           this.priceperitem = price;           
        if(price < 0.0)
            priceperitem = 0.0; 
        
        
}       
public void setPartNumber(String number)
{           
        partNumber = number;            
}       
public String getPartNumber()
{           
        return partNumber;
}   
public void setPartDescription (String description)
{           
        partDescription = description;
}       
    public String getPartDescription(){         
        return partDescription;         
    }   
    public void setQuantity(int count){         
        if(count > 0)
            quantity = 0;           
    }       
    public int getQuantity(){           
        return quantity;
    }   
       
    public double getPrice(){           
        return priceperitem;
    }   
    public double getInvoiceAmount(){           
         amount = getQuantity() * getPrice();           
         return amount;
    }       
}