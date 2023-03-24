public class CheckingAccount extends BankAccount {
    double interestRate, minimumBalance, serviceCharge;

    public CheckingAccount(int accNum, double bal)
    {
        accountNumber = accNum;
        balance = bal;
        interestRate = 0.02;
        minimumBalance = 5;
        serviceCharge = 2;
    }
    
    public double getMinimumBalance()
    {
        return minimumBalance;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public double getServiceCharge()
    {
        return serviceCharge;
    }

    public void postInterest()
    {
        balance += interestRate * balance;
    }

    public boolean verifyMinimumBalance(double amt)
    {
        return balance - amt > minimumBalance;
    }

    public void writeCheck(double amt)
    {
        if(verifyMinimumBalance(amt))
        {
            balance -= amt + serviceCharge;
        }
        else
        {
            System.out.println("Cannot write check, amount exceeds minimum balance.");
        }
    }

    public void print()
    {
        System.out.println("Account Number: " + accountNumber + 
                           "\nBalance: $" + balance +
                           "\nInterest Rate: " + interestRate * 100 + "%\n" +
                           "Minimum Balance: $" + minimumBalance +
                           "\nService Charge: $" + serviceCharge);
    }
}
