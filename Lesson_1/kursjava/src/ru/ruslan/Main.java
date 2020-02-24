package ru.ruslan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double coastOfTea = 10.0;
        double coastOfCoffee = 30.0;
        double coastOfChocolate = 50.0;

        Scanner scForCoast = new Scanner(System.in);
        Scanner scForProduct = new Scanner(System.in);
        Scanner scForyesno = new Scanner(System.in);
    label:
        while (true) {
            System.out.println("Внесите сумму:");
            double enterCash = scForCoast.nextDouble();
            if (enterCash < 10) {
                System.out.println("Дополните сумму хотябы до 10 руб. ");
            }
            else if (enterCash >= 10) {

                while (true) {
                    System.out.println("Какой продукт вы желаете?");
                    String product = scForProduct.nextLine();

                    switch (product) {
                    case "Чай":
                        if (enterCash >= coastOfTea){
                            System.out.println("Пожалуйста, ваш чай!");
                            enterCash -= coastOfTea;
                        }
                        break;
                    case "Кофе":
                        if (enterCash >= coastOfCoffee){
                            System.out.println("Пожалуйста, ваш кофе!");
                            enterCash -= coastOfCoffee;
                        }
                        break;
                    case "Шоколадка":
                        if (enterCash >= coastOfChocolate){
                            System.out.println("Пожалуйста, ваш шоколадка!");
                            enterCash -= coastOfChocolate;
                        }
                        break;
                }


            // Продумать выдачу продуктов, если осталась сдача
            if (enterCash >= 10) {
                System.out.println("У Вас осталась сдача " + enterCash + " руб.  Что нибудь желаете ещё купить?");
                String yesno = scForyesno.nextLine();

                switch (yesno) {
                    case "Да":
                        continue;

                    case "Нет" :
                        System.out.println("Ваша сдача " + enterCash + " руб.");
                        enterCash = enterCash - enterCash;
                        break label;

                }

            }

        }
        }
    }
}
}

