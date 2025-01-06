package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainIfAmountIsNotMultipleOfBoundary_J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountIsMultipleOfBoundary_J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn100WhenAmountIs900_JUnit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0WhenAmountIs1000_JUnit5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}