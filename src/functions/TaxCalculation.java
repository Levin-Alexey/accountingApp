package functions;

public class TaxCalculation {

    public int getTaxEarningsMinusSpendings(int earnings, int spendings){
        int tax = (earnings - spendings) * 15 / 100;
        return Math.max(tax, 0);
    }

    public int getIncomeTax6Percent(int earnings){
        return earnings * 6 / 100;
    }

    public void showTaxRecommendation(int earningsMinusSpendings, int incomeTax6Percent){
        if (earningsMinusSpendings < incomeTax6Percent){
            System.out.println("Мы советуем Вам - УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + earningsMinusSpendings + " рублей");
            System.out.println("Налог на другой системе: " + incomeTax6Percent + " рублей");
            System.out.println("Экономия: " + (incomeTax6Percent - earningsMinusSpendings) + " рублей");
        }
    }

}
