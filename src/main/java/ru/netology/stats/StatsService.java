package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0; // сумма месяцев
        for (long sale : sales) { // поочереди берем 1 месяц и помещаем в sales
            totalSale += sale; // + месяц
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length; // вызываем ранний метод и делем на количество
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthBelowAverage(long[] sales) {
        int counter = 0; // сумма месяцев
        long averageSale = average(sales);
        for (long sale : sales) { // поочереди берем 1 месяц и помещаем в sales
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0; // сумма месяцев
        long averageSale = average(sales);
        for (long sale : sales) { // поочереди берем 1 месяц и помещаем в sales
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}