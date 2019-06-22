package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertableCurrency {
    CurrencyType currencyType = CurrencyType.FRANC;

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
