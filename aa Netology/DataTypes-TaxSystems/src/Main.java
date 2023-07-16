import java.util.Scanner;

public class Main {
    static int earnings = 0;
    static int spendings = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
            System.out.println("\"end\" - Завершить работу программы");

            String input = sc.nextLine();
            if (input.equals("end")) {
                System.out.println("Работа программы завершена");
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        addEarnings();
                        break;
                    case 2:
                        addSpendings();
                        break;
                    case 3:
                        int taxEarnings = taxEarnings();
                        int taxDifference = taxEarningSpendings();
                        System.out.println("\nНалог на доходы составит " + taxEarnings + " рублей");
                        System.out.println("Налог на разницу доходов и расходов составит " + taxDifference + " рублей");
                        if (taxEarnings == taxDifference) {
                            System.out.println("Вы можете выбрать ЛЮБУЮ систему налогообложения" + "\n");
                        } else {
                            if (taxEarnings > taxDifference) {
                                System.out.println("Вам лучше выбрать УСН ДОХОДЫ МИНУС РАСХОДЫ");
                                System.out.println("Экономия составит " + (taxEarnings - taxDifference) + " рублей!\n");
                            } else {
                                System.out.println("Вам лучше выбрать УСН ДОХОДЫ");
                                System.out.println("Экономия составит " + (taxDifference - taxEarnings) + " рублей!\n");
                            }
                        }
                        break;
                    default:
                        System.out.println("Такой операции нет!\n");
                        break;
                } //конец switch
            } //конец else
        } //конец while
    } //конец psvm

    //METHODS
    public static void addEarnings() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите сумму дохода:");
        earnings += sc1.nextInt();
        System.out.println("Теперь Ваши доходы составляют " + earnings + " рублей\n");
    }

    public static void addSpendings() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите сумму расхода:");
        spendings += sc2.nextInt();
        System.out.println("Теперь Ваши расходы составляют " + spendings + " рублей\n");
    }

    public static int taxEarnings() {
        return earnings * 6 / 100;
    }

    public static int taxEarningSpendings() {
        if ((earnings - spendings) > 0) {
            return (earnings - spendings) * 15 / 100;
        } else {
            return 0;
        }
    }

}
