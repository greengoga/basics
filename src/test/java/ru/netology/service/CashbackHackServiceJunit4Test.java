package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJunit4Test {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturnRemainIfAmountIsNotMultipleOfBoundary() {
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIsMultipleOfBoundary() {
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}