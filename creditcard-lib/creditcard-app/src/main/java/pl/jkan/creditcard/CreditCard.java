package pl.jkan.creditcard;

class CreditCard {
    
    private boolean blocked = false;
    private double balance = 0;
    private double cardLimit = 0;
    public void assignLimit(double limit) {
     balance = limit;
     cardLimit = limit;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void block() {
        this.blocked = true;
    }
    
    public boolean isBloked(){
    return blocked= true;  
    }
    public void withdraw(double money){
    balance = balance - money;
    }
    public double getCountBalance (){
        return balance;
    }
  
    
    
}