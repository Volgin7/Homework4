public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {

        System.out.println("Задача 1");

        int age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать ");
        }

    }
    public static void task2() {

        System.out.println("Задача 2");

        float temperature = 4.9f;

        if (temperature < 5.0f) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

    }
}
