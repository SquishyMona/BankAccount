public class Driver {
    public static void main(String args[])
    {
        System.out.println("Bank Account test");
        BankAccount b1 = new BankAccount(1234, 100);
        b1.print();
        b1.deposit(50);
        b1.print();
        b1.withdrawl(200);
        b1.print();
        b1.withdrawl(50);
        b1.print();
        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Balance: $" + b1.getBalance() + "\n");

        System.out.println("Savings Account test");
        SavingsAccount s1 = new SavingsAccount(5678, 100);
        s1.print();
        s1.deposit(50);
        s1.print();
        s1.withdrawl(200);
        s1.print();
        s1.withdrawl(50);
        s1.print();
        s1.postInterest();
        s1.print();
        System.out.println("Interest Rate: " + s1.getInterestRate() * 100 + "%\n");

        System.out.println("Checking Account test");
        CheckingAccount c1 = new CheckingAccount(9012, 100);
        c1.print();
        c1.deposit(50);
        c1.print();
        c1.withdrawl(200);
        c1.print();
        c1.withdrawl(50);
        c1.print();
        c1.postInterest();
        c1.print();
        c1.writeCheck(100);
        c1.print();
        c1.writeCheck(50);
        c1.print();
        System.out.println("Minimum Balance: " + c1.getMinimumBalance());
        System.out.println("Interest Rate: " + c1.getInterestRate());
        System.out.println("Service Charge: " + c1.getServiceCharge());
    }
}
