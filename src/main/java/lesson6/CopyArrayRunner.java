package lesson6;

import java.util.Arrays;

public class CopyArrayRunner {
    public static void main(String[] args) {
        String[] words = {"Mama", "Mila", "Ramu"};
        String[] anotherWords = copyArray(words);
        anotherWords[words.length] = "finish";
        System.out.println(Arrays.toString(anotherWords));
        String[] newArrays = Arrays.copyOf(anotherWords, Math.round(anotherWords.length * 1.5F));
        System.out.println(Arrays.toString(newArrays));
        System.out.println("-----------------------------------");
        String[] effectiveArray = new String[100];
        System.arraycopy(words,0, effectiveArray,5, words.length);
        System.out.println(Arrays.toString(effectiveArray));
    }

    public static String[] copyArray(String[] words) {
        String[] newArray = new String[Math.round(words.length * 1.5F)];
        for (int i = 0; i < words.length; i++) {
            newArray[i] = words[i];
        }
        return newArray;
    }
}
