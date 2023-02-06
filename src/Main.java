public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний");
        }
        System.out.println("Задача2");
        int temp = 6;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("Задача3");
        int speedMax = 61;
        if (speedMax > 60) {
            System.out.println("Если скорость " + speedMax + ", то придется заплатить штраф");
        }
        if (speedMax < 60) {
            System.out.println("Если скорость " + speedMax + ", то можно ездить спокойно");
        }
        System.out.println("Задача4");
        int ageChildren = 25;
        if (ageChildren >= 2 && ageChildren <= 6) {
            System.out.println("Если возраст человека равен " + ageChildren + ", то ему нужно ходить" +
                    "в десткий сад");
        }
        if (ageChildren >= 7 && ageChildren <= 18) {
            System.out.println("Если возраст человека равен " + ageChildren + ", то ему нужно" +
                    "ходить в школу");
        }
        if (ageChildren > 18 && ageChildren < 24) {
            System.out.println("Если возраст человека равен " + ageChildren + ", то его место" +
                    " в университете");
        }
        if (ageChildren > 24) {
            System.out.println("Если возраст человека равен " + ageChildren + ", то ему пора " +
                    "ходить на работу");
        }
        System.out.println("Задача5");
        boolean isAdultHere = true;
        int childrenAge  = 15;
        if (childrenAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он не может " +
                    "кататься на атракционе");
        }
        if (childrenAge > 5 && childrenAge < 14 && isAdultHere) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может " +
                    "кататься в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (childrenAge > 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может " +
                    "кататься без сопровождения");
        }
        System.out.println("Задача6");
        int totalCapacity = 102;
        int seatCapacity = 60;
        int busy = 62;
        if (busy <= totalCapacity) {
            if (busy <= seatCapacity) {
                System.out.println("Есть сидячее место");
            } else {
                System.out.println("Только стоячее место");
            }
        } else {
            System.out.println("Свободных мест нет");
        }
        System.out.println("Задача7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (two - one >= three) {
            System.out.println("Большее число " + two);
        } else {
            System.out.println("Больше число " +three);
        }

        }


        }



