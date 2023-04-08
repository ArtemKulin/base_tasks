package ru.kulinartem.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  Отыскание первого неповторяющегося символа
 */

public class FirstNonRepeatableChar {

    public static void main(String[] args) {
        String string = "aarreeeennnmmmaadfdv";
        Integer codePoint = string.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(element -> element.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);


        String result = String.valueOf(Character.toChars(codePoint));

        System.out.println(result);


    }
}
