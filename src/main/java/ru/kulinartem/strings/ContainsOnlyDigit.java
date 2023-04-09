package ru.kulinartem.strings;

/**
 * Проверка содержит ли стока только цифры
 */
public class ContainsOnlyDigit {

    public static void main(String[] args) {
        String str = "asdf3421fs";

        boolean result = true;
        for (int i = 0; i <str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                result = false;
                break;
            }
        }

        boolean streamResult = str.chars()
                .anyMatch(n -> !Character.isDigit(n));

        boolean patternResult = str.matches("[0-9]+");

    }
}
