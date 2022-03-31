package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(sales);
        System.out.println("Сумма всех продаж: " + actual);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverage(sales);
        System.out.println("Средняя сумма продаж: " + actual);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);
        System.out.println("Максимальные продажи в " + actual + " месяце");

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        System.out.println("Минимальные продажи в " + actual + " месяце");

        assertEquals(expected, actual);
    }

    @Test
    void shouldLowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowAverageSales(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + actual);

        assertEquals(expected, actual);
    }

    @Test
    void shouldOverAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.overAverageSales(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + actual);

        assertEquals(expected, actual);
    }
}