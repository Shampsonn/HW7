package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }
    public long average(long[] sales) {
        long averegeSale = sum(sales) / 12;
        return averegeSale;
    }

    public int maxMonth(long[] sales){
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] <= sales[i]) {
                    month = i;
            }
        }
        return month + 1;
    }

    public int minMonth(long[] sales){
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] >= sales[i]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthsBelowAverege (long[] sales) {
        long averegeSale =  average(sales);
        int month = 0;
        for (long sale : sales) {
            if(sale < averegeSale) {
                month ++;
            }
        }
        return month;
    }

    public int monthsAboveAverege (long[] sales) {
        long averegeSale =  average(sales);
        int month = 0;
        for (long sale : sales) {
            if(sale > averegeSale) {
                month ++;
            }
        }
        return month;
    }


}
