package TestTasksForInterview;

import java.util.Scanner;

public class DeleteSpaceReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Ваша строка: " + str + ". Давайте удалим из неё все пробелы ");

        String st2 = str.replaceAll("\\s", "");
        System.out.println(st2);
    }
}
//Q # 18) Напишите Java-программу для удаления всех пробелов из строки с помощью replace().
