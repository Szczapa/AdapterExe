package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CurrencyAdapter currencyAdapter = new CurrencyAdapter();

        double euros = 100;
        System.out.println(euros + " EUR = "
                + currencyAdapter.convert("EUR", "USD", euros) + " USD");

        double dollars = 100;
        System.out.println(dollars + " USD = "
                + currencyAdapter.convert("USD", "EUR", dollars) + " EUR");


        System.out.println(dollars + " USD = "
                + currencyAdapter.convert("USD", "GBP", dollars) + " GBP");

        double gbp = 100;
        System.out.println(gbp + " GBP = "
                + currencyAdapter.convert("GBP", "USD", gbp) + " USD");
    }
}