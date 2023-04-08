package ru.kulinartem.strings;


import java.util.Map;
import java.util.stream.Collectors;

/**
 * Подсчет повторяющихся символов. Написать программу, которая подсчиты­
 * вает повторяющиеся символы в заданной строке.
 */

public class RepeatedChars {

    public static void main(String[] args) {
        String string = "abcdegsaa";
        Map<Character, Long> result = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        /**
         * ранние версии Юникода содержали символы со значениями
         * менее 65 535 (OxFFFF). Java представляет эти символы, используя 16-битный тип
         * char. Вызов метода charAt(i) работает, как и ожидалось, до тех пор, пока i не пре­
         * высит 65 535. Но со временем Юникод добавил еще больше символов, и макси­
         * мальное значение достигло 1 114 111 (OxlOFFFF). Эти символы не укладываются в
         * 16 бит, и поэтому были предусмотрены 32-битные значения (так называемые кодо­
         * вые точки) для схемы кодирования UTF-32.
         */


        Map<String, Long> uniCodeResult = string.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(result);
        System.out.println(uniCodeResult);


    }
}
