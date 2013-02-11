package com.awesomevendingco.vendingmachine.machine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.awesomevendingco.vendingmachine.coins.MockCoinTranslator;

public class VendingMachine_WhenValidCoinInserted_Test {

    private VendingMachine machine;

    @Before
    public void setup() {
        machine = new VendingMachine();
        machine.setCoinTranslator(new MockCoinTranslator());
        machine.insertCoin("COIN");
    }

    @Test
    public void it_displays_balance_of_inserted_coin() {
        assertEquals("0.45", machine.getBalance());
    }

    @Test
    public void it_displays_message_of_insert_coin() {
        assertEquals("INSERT COIN", machine.getMessage());
    }

}