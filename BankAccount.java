class BankAccount {
    int accountNumber;
    double balance;

    public void setBalance(double bal) {
        balance = bal;
    }
    public void withdrawl(double amount) {
        if (amount > balance)
        {
            System.out.println("Cannot withdrawl: balance too low");
        }
        balance = balance - amount;
    }
}