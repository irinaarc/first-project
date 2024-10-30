package TestTasksForInterview;

import java.util.Scanner;

public class StringReverseWithoutReverse {
        public static void main(String[] args) {
        String str = "второй раз пытемся быть молодцом";
        char symb[];
        symb = str.toCharArray();
        for (int i = 0; i < symb.length; i++) {
            System.out.print(symb[symb.length - i - 1]);
        }
        System.out.println("   //похоже, получилось");

        System.out.println("Cледующий способ");
        System.out.println("Введите вашу строку, которая будет перевернута: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] temp = s.split("");
        for(int i= temp.length-1; i>=0; i--) {
            System.out.print(temp[i] + "");
        }

            System.out.println();
            System.out.println("попробуем еще раз");
            String reverseString = "";
            for (int i = s.length()-1 ; i >= 0 ; i--) {
                reverseString = reverseString + s.charAt(i);
            }
            System.out.println(reverseString);
    }
}

// Напишите программу на Java для переворота последовательности символов в строке
// без использования встроенной в String функции reverse().
// тут три решения. через стрингбилдер. через разбиение в массив чар. и переворот. и через создание еще одной строки и разбиение

