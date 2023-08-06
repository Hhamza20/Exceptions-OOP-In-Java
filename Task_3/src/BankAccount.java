import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double initialBalance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Your new Balance is "+balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount>balance){
            throw new InsufficientFundsException("Amount should be less than balance which is "+balance+" Rs");
        }
        else {
            balance=balance-amount;
            System.out.println("Your balance after withdraw is "+balance);
        }
    }
}
