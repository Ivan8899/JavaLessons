package lesson6;

import java.util.Arrays;

public class WordReducerRunner {
    public static void main(String[] args) {
        String[] words = {"big", "Hi", "from", " Word", "It-Park", "from"};
        System.out.println(Arrays.toString(intersect(words, "from"))); // {"big", "Hi", "from", " Word", "It-Park", "from"}
        System.out.println(Arrays.toString(intersect(words, "Hi"))); // {"big", "Hi", "from", " Word", "It-Park", "from"}


    }

    public static String[] intersect(String[] initialArray, String word) {
        String[] result = new String[initialArray.length];
        System.arraycopy(initialArray, 0, result, 0, initialArray.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals(word)) {
                result[i] = null;
            }
        }

        int maxNotNullIndexes = 0;
        for (String str : result) {
            if (str != null) {
                maxNotNullIndexes++;
            }
        }
        String[] newResult = new String[maxNotNullIndexes];
        int counter = 0;
        for (String str : result) {
            if (str != null) {
                newResult[counter++] = str;
            }
        }
        return newResult;
    }

}
