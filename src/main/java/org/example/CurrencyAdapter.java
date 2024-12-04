package org.example;

public class CurrencyAdapter implements ICurrencyAdapter {
    private final CurrencyConverter currencyConverter;

    public CurrencyAdapter() {
        currencyConverter = new CurrencyConverter();
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        String key = fromCurrency + "_TO_" + toCurrency;

        return switch (key) {
            case "EUR_TO_USD" -> currencyConverter.convertEuroToDollar(amount);
            case "USD_TO_EUR" -> currencyConverter.convertDollarToEuro(amount);
            case "USD_TO_GBP" -> currencyConverter.convertDollarToGbp(amount);
            case "GBP_TO_USD" -> currencyConverter.convertGbpToDollar(amount);
            default -> throw new IllegalArgumentException("Conversion non supportée entre "
                    + fromCurrency + " et " + toCurrency);
        };
    }

}
