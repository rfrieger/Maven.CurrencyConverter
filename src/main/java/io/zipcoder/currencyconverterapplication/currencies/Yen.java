package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    CurrencyType currencyType = CurrencyType.YEN;

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
