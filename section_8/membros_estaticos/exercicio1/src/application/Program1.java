package application;

import java.util.Scanner;
import util.CurrencyConverter;
import java.util.Locale;

public class Program1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double cotDollar, ammountDollars;

        // input data
        System.out.print("What is the dollar price? ");
        cotDollar = sc.nextDouble(); // 3.50
        System.out.print("How many dollars will be bought? ");
        ammountDollars = sc.nextDouble(); // 200

        // processing
        double conversao = CurrencyConverter.dollarToReal(cotDollar, ammountDollars);

        // output
        System.out.printf("Amount to be paid reais = R$ %.2f reais%n", conversao);

        sc.close();
    }
}

