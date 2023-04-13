package ru.kulinartem.strings;

/**
 * Подсчет появлений некоторого символа в строке
 */
public class CountCharInString {

    public static void main(String[] args) {
        String str = "Welcome home noobie";
        char ch = 'o';

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println(count);

        //

        long result = str.chars()
                .filter(c -> c == ch)
                .count();

        System.out.println(result);

    }
}
