package io.zipcoder.currencyconverterapplication;

import java.lang.reflect.Type;

public interface ConvertableCurrency {
        public default Double convert(CurrencyType currencyType) {
            return currencyType.getRate()/getCurrencyType().getRate();
        }

     public CurrencyType getCurrencyType();
    }







