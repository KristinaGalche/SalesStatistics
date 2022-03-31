package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
//        System.out.println("Сумма всех продаж: " + sum);
        return sum;
    }

    public int findAverage(int[] sales) {
        int average = calcSum(sales) / sales.length;
//        System.out.println("Средняя сумма продаж: " + average);
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
//        System.out.println("Максимальные продажи в " + (maxMonth + 1) + " месяце");
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
//        System.out.println("Минимальные продажи в " + (minMonth + 1) + " месяце");
        return minMonth + 1;
    }

    public int lowAverageSales(int[] sales) {
        int count = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
//        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + count);
        return count;
    }

    public int overAverageSales(int[] sales) {
        int count = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
//        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + count);
        return count;
    }
}
