public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i  = 1; i <= 10; i ++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i  = 10; i >= 1; i --) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i  = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i  = 10; i >= -10; i --) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i  = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        System.out.println("Задача 6");
        for (int i  = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i  = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int savings = 0;
        for (int i  = 1; i <= 12; i ++) {
            savings += 29_000;
            System.out.println("Месяц номер " + i + ", сумма накоплений равна " + savings);
        }
        System.out.println("Задача 9");
        float interestSavings = 0f;
        for (int i  = 1; i <= 12; i ++) {
            interestSavings += 29_000;
            interestSavings *= 1.12;
            System.out.println("Месяц номер " + i + ", сумма накоплений равна " + interestSavings);
        }
        System.out.println("Задача 9");
        for (int i  = 1; i <= 10; i ++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}