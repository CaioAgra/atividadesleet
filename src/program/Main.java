package program;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Easy cEasy = new Easy();

        System.out.println("------- EX 1 TWOSUM------");
        System.out.println(Arrays.toString(cEasy.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(cEasy.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(cEasy.twoSum(new int[]{3, 3}, 6)));

        System.out.println("------- EX 9 PALINDROMO ------");
        System.out.println(cEasy.isPalindrome(232));
        System.out.println(cEasy.isPalindrome(123));

        System.out.println("------- EX 13 ROMAN TO INTEGER ------");
        System.out.println(cEasy.romanToInt("III"));
        System.out.println(cEasy.romanToInt("LVIII"));
        System.out.println(cEasy.romanToInt("MCMXCIV"));

        System.out.println("------- EX 14 LONGEST COMMON PREFIX------");
        System.out.println(cEasy.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(cEasy.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));

        System.out.println("------- EX 20 VALID PARENTHESES ------");
        System.out.println(cEasy.isValid("()"));
        System.out.println(cEasy.isValid("()[]{}"));
        System.out.println(cEasy.isValid("(]"));

        System.out.println("------- EX 136 SINGLE NUMBER ------");
        System.out.println(cEasy.singleNumber(new int[]{2,2,1}));
        System.out.println(cEasy.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(cEasy.singleNumber(new int[]{2,2,1}));

        System.out.println("------- EX 1662 CHECK IF TWO STRING ARRAYS ARE EQUIVALENT------");
        System.out.println(cEasy.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(cEasy.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(cEasy.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }
}


