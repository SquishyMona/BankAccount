public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accNum, double bal)
    {
        accountNumber = accNum;
        balance = bal;
        interestRate = 0.04;
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }

    public void postInterest()
    {
        balance += balance * interestRate;
    }

    public void print()
    {
        System.out.println("\tAccount Number: " + accountNumber + 
                           "\n\tBalance: $" + balance +
                           "\n\tInterest Rate: " + interestRate * 100 + "%\n");
    }
}
