package com.awesomevendingco.vendingmachine.coins;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CoinTranslatorTest {

    private CoinTranslatorImpl translator;

    @Before
    public void setup() {
        translator = new CoinTranslatorImpl();
        translator.setCoinValues(coinValue());
    }

    private Map<String, Double> coinValue() {
        Map<String, Double> coinValues = new HashMap<String, Double>();
        coinValues.put("COIN", 0.45);
        return coinValues;
    }

    @Test
    public void itReturnsTheValueOfCoin() {
        double value = translator.valuateCoin("COIN");
        assertEquals(0.45, value, 0.001);
    }

    @Test(expected = InvalidCoinException.class)
    public void itThrowsInvalidCoinExceptionWhenCoinIsInvalid() {
        translator.valuateCoin("BAD_COIN");
    }

}