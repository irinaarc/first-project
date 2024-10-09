package Algorithms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sort {
    public static void main(String[] args) {
        int[] sortArr = {12,6,4,1,15,10};
        bubbleSort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "  ");
        }


//   System.out.println(parse("iiisdoso"));
//        System.out.println(parse("iiisdosodddddiso"));

        System.out.println(findNextPower(12385, 3));
        System.out.println(findNextPower(1245678, 5));
        System.out.println(findNextPower(1245678, 6));
    }

    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length-1; i++) {
            for (int j = 0; j < sortArr.length- i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]){
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = swap;
                }
            }
        }
    }

//    public static int[] parse(String data) {
//        int[] result = new int[10];
//        int symbol = 0;
//        int n = 0;
//
//        char[] charArray = data.toCharArray();
//        for (char c : charArray){
//            switch (c) {
//                case 'i':
//                    symbol++;
//                    break;
//                case 'd':
//                    symbol--;
//                    break;
//                case 's':
//                    symbol *= symbol;  break;
//                case 'o':
//                    result[n] = symbol;
//                    n++;
//                    break;
//                default:
//                    // Ignore invalid characters
//                    break;
//            }
//        }
//        return result;
//    }

    public static int findNextPower(int val, int p) {
        int result = 0;
        int x = (int) Math.pow(val, 1.0/p);
        return (int) Math.pow((x+1), p);
    }
}
// если x:=a^b;
//тогда справедливо:
//x=exp(b*ln(a))
