package NameGUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - приветствие по имени");
        System.out.println("2 - узнать сумму двух чисел");
        System.out.println("3 - завершение работы");
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        GUI app1 = new GUI();
        Sum app2 = new Sum();

              if (n == 1) {
                    app1.setVisible(true);
                    }

                if (n == 2) {
                    app2.setVisible(true);
                    }

                if (n == 3) {
                    System.out.println("Завершение работы");
                }

                if ((n!=1) && (n!=2) && (n!=3)) {
                    System.out.println("Неправильный выбор, введите 1, 2 или 3");
                }

            }
        }



