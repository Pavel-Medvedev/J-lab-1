package org.example;

public class Palindrome {
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++)
            if (isPalindrome(args[i]))
                System.out.println(args[i] + " is palindrome.");
            else System.out.println(args[i] + " isn\'t palindrome");
    }
    private static String reversString(String str){
        String nStr = "";
        for (int i = (int) str.length() - 1; i > -1; i--)
            nStr += str.charAt(i);
        return nStr;
    }
    private static boolean isPalindrome(String str){
        return str.equals(reversString(str));
    }
}
