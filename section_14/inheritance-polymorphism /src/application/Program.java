package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(4715, "John", 1200.0);

        BusinessAccount bacc = new BusinessAccount(2425, "Beth", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(2565, "Bob", 0.0, 500.0);
        Account acc3 = new SavingsAccount(2623, "Jamie", 100.0, 0.03);
        

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(150.0);

        //  BusinessAccount acc5 = (BusinessAccount)acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(150.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // OVERRIDE WITHDRAW METHOD OF SUPERCLASS

        Account acc7 = new Account(8589, "Alex", 500.0);
        acc7.withdraw(150.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new SavingsAccount(6589, "Tate", 1700.0, 0.01);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        Account acc9 = new BusinessAccount(5654, "Kayce", 2000.0, 250.0);
        acc9.withdraw(200.0);
        System.out.println(acc9.getBalance());
    }
}
