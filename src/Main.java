public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    public static void task1() {
        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + money;
            month = month + 1;
            System.out.println("Месяц " + month + "  сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 0;
        while (num <= 9) {
            num = num + 1;
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int everyEach = 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + population / everyEach * (birth - death);
            System.out.println("Год " + i + " численность населения составляет " + population);

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int interestBalance = 7;
        for (int i = 1; deposit <= 12000000; i++) {
            deposit = deposit + deposit / 100 * interestBalance;
            System.out.println("за " + i + "-й месяц, накопленно: " + deposit + " рублей");

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int interestBalance = 7;
        for (int i = 1; deposit <= 12000000; i++) {
            deposit = deposit + deposit / 100 * interestBalance;
            if (i % 6 == 0)
                System.out.println("за " + i + "-й месяц, накопленно: " + deposit + " рублей");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int interestBalance = 7;
        for (int i = 1; i < 9 * 12; i++) {
            deposit = deposit + deposit / 100 * interestBalance;
            if (i % 6 == 0) {
                System.out.println("за " + i + "-й месяц, накопленно: " + deposit + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fistFridayOn = 3;
        int daysOnMarch = 31;
        int currentDay = fistFridayOn;
        while (currentDay <= daysOnMarch) {
            System.out.println("Сегодня пятница," + currentDay + "-е число. Необходимо подготовить отчет.");
            currentDay = currentDay + 7;

        }
    }


    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int cometPassedBefore = currentYear - 200; // 1823
        int cometWillPass = currentYear + 100; // 2123
        int cometPassedEveryYear = 79;
        int cometWas = (cometPassedBefore / cometPassedEveryYear) * cometPassedEveryYear + cometPassedEveryYear;
        for (int i = cometWas; i <= cometWillPass; i = i + 79) {

            System.out.println(i);
        }

    }
}