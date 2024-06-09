public class bankAccount {
    // Private attributes
    private String accountnumber;
    private double balance;

    // Constructor
    public bankAccount(String accountnumber, double initialbalance){
        this.accountnumber = accountnumber;
        if (initialbalance >= 0) {
            this.balance = initialbalance;
        } else {
            this.balance = 0;
        System.out.println("Setting balance to zero since balance must be non-negative");    
        }
    }

    // Public getter for accountnumber
    public String getAccountnumber(){
    return accountnumber;
    }

    // Public getter for balance
    public double getBalance(){
        return balance;
    }

    // Creating a public method to deposit money
    public void deposit(double amount){
        if (amount >= 0){
            balance += amount;
        } else {
           System.out.println("Deposit amount must be positive");
        }
    }

    // Public method to withdraw money from account
    public void withdraw(double amount){
      if(amount > 0 && amount<= balance){
        balance -= amount;
      } else {
        System.out.println("Invalid withdrawal amount");
      }
    }

    // Main method for testing encapsulation
    public static void main(String[] args){
        bankAccount account = new bankAccount("0014089562", 1089.90);
    
    //Accessing attributes using the getter methods
    System.out.println("ACCOUNT NUMBER: " + account.getAccountnumber());
    System.out.println("Balance: $" + account.getBalance());
  
    //Depositing money
    account.deposit(345.90);
    System.out.println("Balance after deposit: $" + account.getBalance());

    //Withdrawing money from bank account
    account.withdraw(450.00);
    System.out.println("Balance after money withdrawal: $" + account.getBalance());
    
    // Attempting to withdraw an invalid amount
    account.withdraw(189066.00);
    System.out.println("Balance after invalid withdrawal: $" + account.getBalance());
    }
}