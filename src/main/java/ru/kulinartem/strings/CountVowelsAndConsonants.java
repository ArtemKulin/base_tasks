package ru.kulinartem.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Подсчет гласных и согласных
 */
public class CountVowelsAndConsonants {

    public static void main(String[] args) {
        Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        String string = "Welcome home sweetie";

        int vowels = 0;
        int consonants = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (allVowels.contains(c)) {
                vowels++;
            } else if ((c >= 'a' && c <= 'z')) {
                consonants++;
            }
        }

        Map<Integer, Integer> result = Map.of(vowels, consonants);

        System.out.println(result);

        Map<Boolean, Long> stream = string.chars()
                .mapToObj(c -> (char) c)
                .filter(character -> (character >= 'a' && character <= 'z'))
                .collect(Collectors.partitioningBy(allVowels::contains, Collectors.counting()));

        Map<Long, Long> streamResult = Map.of(stream.get(true), stream.get(false));

        System.out.println(streamResult);

    }
}
