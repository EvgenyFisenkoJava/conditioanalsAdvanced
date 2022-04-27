package ru.skypro.course1.homeworkAdvanced;

public class Main {
    public static void main(String[] args) {
        // write your code here

        // задача 6

        int age = 19;
        int salary = 58_000;
        double limit;

        if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            limit = (salary * 3) * 1.2;
            System.out.println("Мы готовы ввыдать вам карту с лимитом " + limit + " рублей.");
        }
        else if (age >= 23 && salary >= 80_000) {
            limit = (salary * 3) * 1.5;
            System.out.println("Мы готовы ввыдать вам карту с лимитом " + limit + " рублей.");
        }
        else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            limit = (salary * 2) * 1.2;
            System.out.println("Мы готовы ввыдать вам карту с лимитом " + limit + " рублей.");
        }
        else if (age < 23 && salary >= 80_000) {
            limit = (salary * 2) * 1.5;
            System.out.println("Мы готовы ввыдать вам карту с лимитом " + limit + " рублей.");
        }
        else {
            System.out.println("Вы не подходите под условия кредитования.");
        }

        // задача 7

        int age1 = 25;
        int salary1 = 60_000;
        int wantedSum = 330_000;
        int maxPayment = salary1 / 2;
        double creditPayment;
        double baseRate = wantedSum * 0.1;

        if (age1 < 23 && salary1 < 80_000) {
            creditPayment = (baseRate + (wantedSum * 0.01));
            if (maxPayment > creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            }
            if (maxPayment < creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        else if (age1 < 23 && salary1 >= 80_000) {
            creditPayment = (baseRate + (wantedSum * 0.01) - (wantedSum * 0.007));
            if (maxPayment > creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            }
            if (maxPayment < creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        else if (age1 >= 23 && age1 < 30 && salary1 < 80_000) {
            creditPayment = (baseRate + (wantedSum * 0.005));
            if (maxPayment > creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            }
            if (maxPayment < creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        else if (age1 >= 23 && age1 < 30 && salary1 >= 80_000) {
            creditPayment = (baseRate + (wantedSum * 0.005) - (wantedSum * 0.007));
            if (maxPayment > creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            }
            if (maxPayment < creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        else if (age1 >= 30 && salary1 >= 80_000) {
            creditPayment = (baseRate - (wantedSum * 0.007));
            if (maxPayment > creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            }
            if (maxPayment < creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }
        else {
            creditPayment = baseRate;
            if (maxPayment > creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Одобрено.");
            }
            if (maxPayment < creditPayment) {
                System.out.println("Максимальный платеж при зарплате " + salary1 + " рублей равен " + maxPayment +
                        "." + " Платеж по кредиту " + creditPayment + " рублей. Отказано.");
            }
        }





    }
}
