package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    CurrencyType currencyType = CurrencyType.EURO;

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
