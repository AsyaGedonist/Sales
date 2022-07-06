package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @Test
    public void testGetSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.getSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetAvgSales() {
        StatsService service = new StatsService();
        int expected = 15;
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.getAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMaxMonthSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.getMaxMonthSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMinMonthSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.getMinMonthSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetLessAvgMonth() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.getLessAvgMonths(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetMoreAvgMonth() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.getMoreAvgMonths(sales);
        Assertions.assertEquals(expected, actual);
    }
}
