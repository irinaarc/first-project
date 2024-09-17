package Kata;

public class GoodPairs {
    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{1,3,4} , new int[] {1,3,4}, 1));
        System.out.println(numberOfPairs(new int[]{1,2,4,12} , new int[] {2,4}, 3));
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % k != 0)
                continue;
                for (int j = 0; j < nums2.length; j++) {
                if ( nums1[i] % (nums2[j] * k) == 0) count++;
            }
        }
        return count;
    }
}
