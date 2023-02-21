public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        int ageOfAdult = 18;
        if (age >= ageOfAdult) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать ");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        float temperature = 4.9f;
        float boundaryTemparature = 5.0f;
        if (temperature < boundaryTemparature) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        float velocity = 60.1f;
        float limitOfVelocity = 60.0f;
        if (velocity > limitOfVelocity) {
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

    public static void task6() {
        System.out.println("Задача 6");
        int cabinsCapacityOfPassengers = 102;
        int numberOfSeats = 60;
        int numberOfPassenger = 61;
        if (numberOfPassenger > cabinsCapacityOfPassengers) {
            System.out.println("Вагон полностью забит");
        } else {
            if (numberOfPassenger > numberOfSeats) {
                System.out.println("В вагоне есть стоячее место");
            } else {
                System.out.println("В вагоне есть сидячее и стоячее место");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 161;
        int two = 161;
        int three = 162;
        if (one > two && one > three) {
            System.out.println("Число one, равное " + one + " - большее");
            } else {
                if (two > one && two > three) {
                    System.out.println("Число two, равное " + two + " - большее");
                    } else {
                        if (three > one && three > two) {
                            System.out.println("Число three, равное " + three + " - большее");
                            } else {
                                System.out.println("Числа равны");
                        }
                    }
            }
    }
}

