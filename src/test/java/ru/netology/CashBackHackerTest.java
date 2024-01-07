package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    @org.testng.annotations.Test
    public void cashbackAccrualWhenPurchasingFor900() {

        CashBackHacker service = new CashBackHacker();

        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void cashbackAccrualWhenPurchasingFor1000() {
        CashBackHacker service = new CashBackHacker();
        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void cashbackAccrualWhenPurchasingFor1100() {

        CashBackHacker service = new CashBackHacker();


        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void cashbackAccrualWhenPurchasingFor999() {

        CashBackHacker service = new CashBackHacker();


        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

}