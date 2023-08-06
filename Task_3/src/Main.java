public class Main {
    public static void main(String[] args) {
       BankAccount obj=new BankAccount("ABC1001","Hamza",20000);
       obj.deposit(3000);
       try {
           obj.withdraw(200000);
       }
       catch (InsufficientFundsException e){
           System.out.println(e);
       }

    }
}