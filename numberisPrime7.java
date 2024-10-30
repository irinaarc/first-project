package TestTasksForInterview;

import java.util.Scanner;

public class numberisPrime7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        System.out.println("Давайте узнаем, является ли оно простым");
        boolean isPrime = true;
        while (isPrime) {
            for (int i = 2; i <= number/2; i++) {
                if (number%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            break;
        }
        System.out.println("Число " + number + " простое? " + isPrime);
    }
}

//Q # 7) Напишите программу на Java, чтобы узнать, является ли число простым или нет.