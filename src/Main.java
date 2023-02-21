public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task3() {
        System.out.println("Задача 3");
        float velocity = 60.1f;
        if (velocity > 60.0f) {
            System.out.println("Если скорость " + velocity + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + velocity + " то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в детский сад");
        } else {
            if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в школу");
            } else {
                if (age > 18 && age < 24) {
                    System.out.println("Если возраст человека равен " + age + ", то ему надо ходить в университет");
                } else {
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + age + ", то ему надо ходить на работу");
                    }
                }
            }

        }

    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
            } else {
                if (age > 5 && age < 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
                    } else {
                        if (age > 14) {
                            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
                            }
                    }
            }

    }
}
