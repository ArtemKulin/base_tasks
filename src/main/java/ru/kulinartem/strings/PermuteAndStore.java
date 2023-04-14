package ru.kulinartem.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Генерирование всех перестановок
 */
public class PermuteAndStore {

    public static void main(String[] args) {
        String str = "welcome";
        Set<String> strings = permuteAndStore(str);
        strings.forEach(System.out::println);
    }

    public static Set<String> permuteAndStore(String str) {
        return permuteAndStore("", str);
    }
    private static Set<String> permuteAndStore(String prefix, String str) {
        Set<String> permutations = new HashSet<>();
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndStore(
                        prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i))
                );
            }
        }
        return permutations;
    }

}
