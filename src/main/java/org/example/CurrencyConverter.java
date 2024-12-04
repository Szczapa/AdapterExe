package org.example;

public class CurrencyConverter {
    public double convertEuroToDollar(double euroAmount) {
        return euroAmount * 1.18;
    }

    public double convertDollarToEuro(double dollarAmount) {
        return dollarAmount * 0.85;
    }

    public double convertDollarToGbp(double dollarAmount) {
        return dollarAmount * 0.75;
    }

    public double convertGbpToDollar(double gbpAmount) {
        return gbpAmount * 1.33;
    }
}
