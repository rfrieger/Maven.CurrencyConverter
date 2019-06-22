package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {
    CurrencyType currencyType = CurrencyType.POUND;

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
