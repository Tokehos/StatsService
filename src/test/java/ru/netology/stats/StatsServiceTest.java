package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test // 1
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180; // общая сумма продаж за все месяца
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test // 2
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15; // среднее значение продаж за все месяца
        int actual = service.calculateAvg(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test // 3
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // номер месяца с минимальными продажами
        int actual = service.calculateMinSales(purchases);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // номер месяц с максимальными продажами
        int actual = service.calculateMaxSales(purchases);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldBelowTheAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // количество месяцев с продажами ниже среднего
        int actual = service.calculateBelowTheAverageSales(purchases);
        assertEquals(expected, actual);
   }

    @org.junit.jupiter.api.Test
    void shouldOverTheAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // количество месяцев с продажами выше среднего
        int actual = service.calculateOverTheAverageSales(purchases);
        assertEquals(expected, actual);
    }

}
