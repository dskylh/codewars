package StringIncrementer;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        String bruh = stringIncrementer("abc09");
        System.out.println(bruh);
    }
    public static String stringIncrementer(String str) {
        String result = "";
        String num = "";
        boolean hasAnyDigit = false;
        // for (Character c :
        //         str.toCharArray()) {
        //     if (Character.isDigit(c)) {
        //         num += Character.digit(c, 10);
        //         hasAnyDigit = true;
        //     }
        //     else{
        //         result += Character.toString(c);
        //     }
        // }
        char[] chararray = str.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            if (Character.isDigit(chararray[i]))
            
        }
        int numeric = Integer.parseInt(num) + 1;
        
        return result.concat(Integer.toString(numeric));

    }
}
