class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount()
    {
        accountNumber = 0;
        balance = 0;
    }

    public BankAccount(int accNum, double bal)
    {
        accountNumber = accNum;
        balance = bal;
    }

    public void setAccountNumber(int num) {
        accountNumber = num;
     }
     
     public int getAccountNumber() {
        return accountNumber;
     }

    public void setBalance(double bal) {
        balance = bal;
    }

    public double getBalance()
    {
        return balance;
    }

    public void withdrawl(double amount) {
        if (amount > balance)
        {
            System.out.println("Cannot withdrawl: balance too low");
        }
        balance = balance - amount;
    }

    public void deposit(double amt)
    {
        if(amt < 0)
        {
            System.out.println("Cannot deposit a negative amount");
        }
        balance += amt;
    }

    public void print()
    {
        System.out.println("Account Number: " + accountNumber + "\n Balance: $" + balance);
    }
}