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
        for (int i = 0; total < 2_459_000; i = i +1) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

    }

    public static void task2() {
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
        System.out.println((char) 27 + "[34m----------Задача 3----------" + (char)27 + "[0m");
        int totalY = 12_000_000;
        int fertility = 0;
        //System.out.println("Год " +  + ", численность населения составляет " + );
    }

    public static void task4() {
        System.out.println((char) 27 + "[34m----------Задача 4----------" + (char)27 + "[0m");
    }

    public static void task5() {
        System.out.println((char) 27 + "[34m----------Задача 5----------" + (char)27 + "[0m");
    }

    public static void task6() {
        System.out.println((char) 27 + "[34m----------Задача 6----------" + (char)27 + "[0m");
    }

    public static void task7() {
        System.out.println((char) 27 + "[34m----------Задача 7----------" + (char)27 + "[0m");
    }

    public static void task8() {
        System.out.println((char) 27 + "[34m----------Задача 8----------" + (char)27 + "[0m");
    }
}