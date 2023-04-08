package ru.kulinartem.strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Инвертирование букв и слов
 */
public class InvertWords {

    public static void main(String[] args) {
        String sentence = "there is no spoon";

        String whiteSpace = " ";

        String[] words = sentence.split(whiteSpace);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }

            reversedString.append(reversedWord).append(whiteSpace);
        }

        String result = reversedString.toString();

        System.out.println(result);

        //Stream style

        String streamResult = Pattern.compile(" +")
                .splitAsStream(sentence)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(streamResult);
    }
}
