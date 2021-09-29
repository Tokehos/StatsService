package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAvg(int[] purchases) {

        return calculateSum(purchases) / purchases.length;
    }

    public int calculateMinSales(int[] purchases) {
        int minMonth = 0;
        int month = 0;
        for (int purchase : purchases) {

            if (purchase <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMaxSales(int[] purchases) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int purchase : purchases) {
            // sales[manMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (purchase >= purchases[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int calculateBelowTheAverageSales(int[] purchases) {
        int monthBelowAverage = 0;
        int avg = calculateSum(purchases) / purchases.length;
        for (int purchase : purchases) {
            if (purchase < avg) {
                monthBelowAverage = monthBelowAverage + 1;
            }
        }
        return monthBelowAverage;
    }

    public int calculateOverTheAverageSales(int[] purchases) {
        int monthOverAverage = 0;
        int avg = calculateSum(purchases) / purchases.length;
        for (int purchase : purchases) {
            if (purchase > avg) {
                monthOverAverage = monthOverAverage + 1;
            }
        }
        return monthOverAverage;
    }

}
