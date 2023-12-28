package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculate() {
        assertEquals(service.remain(850), 150);

    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCalculateAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

}