package util;

public class CurrencyConverter {

    public static double dollarToReal(double priceDollar, double ammountDollar) {
        double reais = (ammountDollar * 1.06) * priceDollar;
        return reais;
    }
}