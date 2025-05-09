// class atm{
//     private int a;
//     void setrupee(int a){
//         this.a=a;

//     }
//     int getrupee(){

//         return a;

//     }
// }
//  public class my {
 
//     public static void main(String[] args) {
//         atm obj =new atm();
//         obj.setrupee(25000);
//         System.out.println(obj.getrupee());
//     }
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class my {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(2000);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        account.withdraw(4000);
    }
}
