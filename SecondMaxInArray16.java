package TestTasksForInterview;

public class SecondMaxInArray16 {
    public static void main(String[] args) {
        int[] array = {161, 45, 32, 0, -1, 12, 12, 34, 43, 4, 541, 100, 433, 9213, 233, 1, 12, 89, 43, 432};

        int biggest = array[0];
        int secondBiggest = array[0];
        for (int a : array) {
            if (a > biggest){
                secondBiggest = biggest;
                biggest = a;
            } else if (a > secondBiggest && a!=biggest) {
                secondBiggest = a;
            }
        }

        System.out.println("Второе по величине значение равняется  " + secondBiggest +
                "   (а максимальное было )" + biggest);
    }
}
//Q # 16) Напишите Java-программу, чтобы найти второе по величине число в массиве.