package stringbuilder;

import java.util.Locale;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {

        StringBuilder wordReverse = new StringBuilder();

        wordReverse.append(word.toLowerCase());
        wordReverse.reverse();
        if (word.toLowerCase().equals(wordReverse.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindromeIgnoreSpace(String word) {

        StringBuilder wordReverse = new StringBuilder();

        wordReverse.append(word.replace(" ", "").toLowerCase());
        wordReverse.reverse();
        if (word.replace(" ", "").toLowerCase().equals(wordReverse.toString())) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        PalindromeValidator palindromeValidator = new PalindromeValidator();

        if (palindromeValidator.isPalindrome("indul a görög ALUdni")) {
            System.out.println("A kifejezés palindrom");
        } else {
            System.out.println("A kifejezés nem palindrom");
        }

        System.out.println();
        if (palindromeValidator.isPalindromeIgnoreSpace("indul a görög ALUdni")) {
            System.out.println("A kifejezés palindrom");
        } else {
            System.out.println("A kifejezés nem palindrom");
        }
    }
}