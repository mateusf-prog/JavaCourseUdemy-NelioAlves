package application;

import java.util.Scanner;
import entities.Account;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // criando um objeto Account nulo para acessar dentro do bloco if
        Account account = null;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();

        System.out.print("Is there initial deposit (y/n) ? ");
        char resp = sc.next().charAt(0);
        System.out.printf("%n");
        if (resp == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initDep = sc.nextDouble();
            account = new Account(number, holder, initDep);
        } 
        else {
            account = new Account(number, holder);
        }

        // imprimindo o objeto em forma de string
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double dep = sc.nextDouble();
        account.deposit(dep);
        System.out.print(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.print(account);
        System.out.println();

        sc.close();
    }
}