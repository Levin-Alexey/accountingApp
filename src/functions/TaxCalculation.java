package functions;

public class TaxCalculation {

    public static int getTaxEarningsMinusSpendings(int earnings, int spendings){
        int tax = (earnings - spendings) * 15 / 100;
        return Math.max(tax, 0);
    }

    public static int getIncomeTax6Percent(int earnings){
        return (earnings * 6) / 100;
    }

    public static void showTaxRecommendation(int earningsMinusSpendings, int incomeTax6Percent){
        if (earningsMinusSpendings < incomeTax6Percent){
            System.out.println("Мы советуем Вам - УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + earningsMinusSpendings + " рублей");
            System.out.println("Налог на другой системе: " + incomeTax6Percent + " рублей");
            System.out.println("Экономия: " + (incomeTax6Percent - earningsMinusSpendings) + " рублей");
        } else if (earningsMinusSpendings > incomeTax6Percent) {
            System.out.println("Мы советуем Вам - УСН");
            System.out.println("Ваш налог составит: " + incomeTax6Percent + " рублей");
            System.out.println("Налог на другой системе: " + earningsMinusSpendings + " рублей");
            System.out.println("Экономия: " + (earningsMinusSpendings - incomeTax6Percent) + " рублей");
        } else {
            System.out.println("Можете выбрать любую систему налогообложения");
        }
    }

}
