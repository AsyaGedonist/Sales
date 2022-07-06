import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int sumSales = service.getSumSales(sales);
        long avgSales = service.getAvgSales(sales);
        int maxMonth = service.getMaxMonthSales(sales);
        int minMonth = service.getMinMonthSales(sales);
        int lessAvgMonths = service.getLessAvgMonths(sales);
        int moreAvgMonths = service.getMoreAvgMonths(sales);

        System.out.println("1.Сумма всех продаж: " + sumSales);
        System.out.println("2.Средняя сумма продаж в месяц: " + avgSales);
        System.out.println("3.Номер месяца, в котором был пик продаж: " + maxMonth);
        System.out.println("4.Номер месяца, в котором был минимум продаж: " + minMonth);
        System.out.println("5.Кол-во месяцев, в которых продажи были ниже среднего: " + lessAvgMonths);
        System.out.println("6.Кол-во месяцев, в которых продажи были выше среднего: " + moreAvgMonths);
    }
}
