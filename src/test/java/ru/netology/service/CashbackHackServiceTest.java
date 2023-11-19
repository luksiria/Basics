package ru.netology.service;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void Amount900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void Amount1300() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @Test
    public void Amount1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void Amount0() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void AmountMinus900() {
        CashbackHackService service = new CashbackHackService();

        int amount = - 900;

        int actual = service.remain(amount);
        int expected = 1900;
        assertEquals(actual, expected);
    }
}
