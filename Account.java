/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author isado
 */

    // declaring the variables
    public class Account {
    
    private String FirstName, LastName;
    private double Balance;
    private double deposit;
    private double withdraw;
    
    private String Message;
  
    // creating Constructor
    public Account (String FirstName, String LastName,double Balance){
      this.FirstName = FirstName;
      this.LastName = LastName;
      this.Balance = Balance;
     
    }
    

    //getters and setters
    
    //setter of String FirstName with the validation and exception message
    public void setFirstName(String FirstName){
        if (FirstName.matches("[A-Z][a-z]*")){
        this.FirstName = FirstName;
    }
    else{
    throw new IllegalArgumentException("Invalid character in the first name");
    }
      
    }
    public String getFirstName(){
       return FirstName; 
    }
    public void setLastName(String LastName){
        if (LastName.matches("[A-Z][a-z]*")){
        this.LastName = LastName;
    }
    else{
    throw new IllegalArgumentException("Invalid character in the last name");
    }
      
    }
    public String getLastName(){
        return LastName;
    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
    public double getBalance(){
        return ( Balance + deposit - withdraw );
    }
    
    // setter of Double deposit with validation and exception message
    public void deposit(double deposit){
          if (deposit > 0)
          {
              this.Balance = this.Balance + deposit;
          }
          else
          {
              throw new IllegalArgumentException("Cannot deposit a negative number");
          }
    }
    
    public double getdeposit(){
        return deposit; 
    }
    public void withdraw(double withdraw) {
          if(withdraw > 0)
          {
              if(this.getBalance() > withdraw)
              {
                  this.Balance = this.Balance - withdraw;
              }
              else
              {
               throw new IllegalArgumentException("Not Sufficient Funds to withdraw");   
              }
          }
          else
          {
              throw new IllegalArgumentException("Cannot withdraw a negative amount");   
          }
      }
    public double getwithdraw(){
        return withdraw;
    }
   
    //toString
    public String toString(){
    return ("First Name:" + getFirstName()+" "+"Last Name:"+ getLastName()+" "+"Balance:"+ getBalance());
    }
      
}