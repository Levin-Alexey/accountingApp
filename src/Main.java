import functions.TaxCalculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {

            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            } else {
                int operation = Integer.parseInt(input);

                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода: ");
                        String moneyEarningsStr = scanner.nextLine();
                        int moneyEarnings = Integer.parseInt(moneyEarningsStr);
                        earnings += moneyEarnings;
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода: ");
                        String moneySpendingsStr = scanner.nextLine();
                        int moneySpendings = Integer.parseInt(moneySpendingsStr);
                        spendings += moneySpendings;
                        break;
                    case 3:
                        int earningsMinusSpendings = TaxCalculation.getTaxEarningsMinusSpendings(earnings, spendings);
                        int incomeTax6Percent = TaxCalculation.getIncomeTax6Percent(earnings);
                        TaxCalculation.showTaxRecommendation(earningsMinusSpendings, incomeTax6Percent);
                        break;
                    default:
                        System.out.println("Такой операции нет");
                }
            }
        }
        System.out.println("Программа завершена!");
    }
}