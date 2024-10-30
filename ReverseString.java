package TestTasksForInterview;

import java.util.Random;

public class ReverseString {
    public static void main(String[] args) {
        String str = "fhdjaao_kfdn!ofppmeoaRozaUpala_na_lapu_Azora";
        StringBuilder str2 = new StringBuilder(str);
        str2.append("а кто это тут такой молодец");
        System.out.println("Вот изначальная строка: " + str2);
        System.out.println(str2.reverse());
    }
}

// Напишите программу на Java для переворачивания строки, изменив расположение
// символов в строке задом наперёд без использования встроенных в String функций.