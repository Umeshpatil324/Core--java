package Encapsulation;
class BankAccount {
    private double balance;

    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}


