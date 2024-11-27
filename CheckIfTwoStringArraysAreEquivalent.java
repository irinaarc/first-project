package Kata;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1.length == 0 || word2.length == 0) return false;

        String w1 = "";
        String w2 = "";
        for (int i = 0; i < word1.length; i++) {
            w1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            w2 += word2[i];
        }

        return w1.equals(w2);
    }
}
