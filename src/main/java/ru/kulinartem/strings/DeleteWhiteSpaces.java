package ru.kulinartem.strings;

import org.springframework.util.StringUtils;

public class DeleteWhiteSpaces {

    public static void main(String[] args) {
        String str = "  sdd  sdsd   ";

        String result = str.replaceAll("\\s", "");

        String springResult = StringUtils.trimAllWhitespace(str);

        String apacheResult = org.apache.commons.lang3.StringUtils.deleteWhitespace(str);

        System.out.println(result);
        System.out.println(springResult);
        System.out.println(apacheResult);
    }
}
