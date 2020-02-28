package ru.ruslan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        /*while (true){
            double a = sc.nextDouble();
            String oper = sc1.nextLine();
            double b = sc.nextDouble();

            switch (oper){
                case "+":
                    System.out.println(a + b);
                    break;

                case "-":
                    System.out.println(a - b);
                    break;

                case "/":
                    System.out.println(a / b);
                    break;

                case "*":
                    System.out.println(a * b);
                    break;



            }

            String [] fruits = {"Яблоко", "Груша", "Банан", "клубника"};
            String pram = "";
            for (int i=0;i<fruits.length;i++){
                 pram = pram + fruits[i];
            }
            System.out.println(pram);

            String [] param = new String[5];

            for(int  i =0; i<param.length ; i++){
                param[i] = sc.nextLine();
            }

            for (int i =0; i < param.length;i++){
               System.out.println(param[i]);
            }
        }*/

        int [] param = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();

        //String [] param1 = new String [5];
        //int count = 0;

        for (int i=0; i<param.length; i++) {

            if (param[i] % 2 == 0) {
                a.add (param [i]);
            }
            else if (param[i] % 3 == 0) {
                b.add (param[i]);

            }


        }
        System.out.println ("Тут четные числа = " + a + " ");
        System.out.println ("Тут числа делённые на 3 = "+ b + " ");
        /*for (int i = 0 ; i < param.length; i ++){
            for (int j=0; j<param1.length;j++){
                System.out.println(param[i] + " " + param1[j]);
                if (param[i].equals(param1[j])){
                    count ++;
                }
            }
        }*/
        //System.out.println(count);

        // У тебя ьььь три каааа
    }
}

