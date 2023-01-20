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
     /*
     С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить
     2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
     Результат программы должен быть выведен в консоль с тем количеством месяцев,
     которое необходимо для накопления данной суммы. Формат сообщения:
     «Месяц …, сумма накоплений равна … рублей» .
     */
    public static void task1() {
        System.out.println((char) 27 + "[34m----------Задача 1----------" + (char)27 + "[0m");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 2----------" + (char)27 + "[0m");
        int a = 1;
        while (a <= 10){
            System.out.print(a + " ");
            a = a + 1;
        }
        System.out.println(" ");
        for ( int b = 10; b >= 1; b = b - 1) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
    }
    /*
    В стране Y население равно 12 миллионов человек.
    Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте,
    какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
    В консоль выведите результат операции на каждый год в формате:
    «Год …, численность населения составляет …».
     */
    public static void task3() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 3----------" + (char)27 + "[0m");
        int totalY = 12_000_000;
        float fertility =(float) 17 / 1000;
        float mortality = (float) 8 / 1000;
        float growth = fertility - mortality;
        for (int c = 1; c < 11; c = c + 1) {
            totalY += totalY * growth;
            System.out.println("Год " + c + ", численность населения составляет " + totalY);
        }
    }

    public static void task4() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 4----------" + (char)27 + "[0m");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i = i + 1;
            total += total * 0.07;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 5----------" + (char) 27 + "[0m");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i = i + 1;
            total += total * 0.07;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 6----------" + (char)27 + "[0m");
        int salary = 15000;
        int total = 0;
        int i = 0;
        int month = 12 * 9;
        for (int q = 0; q <= month; q = q +1) {
            total += total * 0.07;
            total = total + salary;
            if (q % 6 == 0) {
                System.out.println("Месяц " + q + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 7----------" + (char)27 + "[0m");
        int friday = 5;
        int month = 31;
        for (int w = 5; w <= month; w = w + 7) {
            System.out.println("Сегодня пятница, " + w + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 8----------" + (char)27 + "[0m");
        int startYear = 2023;
        int yearBefore = startYear - 200;
        int yearAfter = startYear + 100;
        for (int e = 0; e < yearAfter; e = e + 79) {
            if (e > yearBefore) {
            System.out.println(e);
            }
        }
    }
}