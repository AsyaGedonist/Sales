package ru.netology.stats;

public class StatsService {
    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int i=0; i<sales.length; i++){
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }
    public int getAvgSales(int[] sales) {
        StatsService service = new StatsService();
        int sumSales = service.getSumSales(sales);
        int avgSales = sumSales/sales.length;
        return avgSales;
    }
    public int getMaxMonthSales(int[] sales) {
        int maxMonth = 0;
        for  (int i=0;i<sales.length;i++){
            if(sales[i] >=sales[maxMonth]) {
                maxMonth = i;
            }
        }
        maxMonth ++;
        return maxMonth;
    }
    public int getMinMonthSales(int[] sales) {
        int minMonth = 0;
        for  (int i=0;i<sales.length;i++){
            if(sales[i] <=sales[minMonth]) {
                minMonth = i;
            }
        }
        minMonth ++;
        return minMonth;
    }
    public int getLessAvgMonths(int[] sales) {
        StatsService service = new StatsService();
        int avgSales = service.getAvgSales(sales);
        int lessAvgMonths = 0;
        for (int i = 0; i<sales.length; i++){
            if(sales[i] < avgSales) {
                lessAvgMonths ++;
            }
        }
        return lessAvgMonths;
    }
    public int getMoreAvgMonths(int[] sales) {
        StatsService service = new StatsService();
        int avgSales = service.getAvgSales(sales);
        int moreAvgMonths = 0;
        for (int i = 0; i<sales.length; i++){
            if(sales[i] > avgSales) {
                moreAvgMonths ++;
            }
        }
        return moreAvgMonths;
    }
}
