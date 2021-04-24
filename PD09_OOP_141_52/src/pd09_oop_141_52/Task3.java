/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd09_oop_141_52;

import java.util.Scanner;

/**
 *
 * @author abdullah
 */
public class Task3 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String s, i, k;
//        System.out.println("Enter String with unlimited spaces: ");
//        s = input.nextLine();
//        System.out.println("Corrected String is: " + ridMultipleBlank(s));
//
//        System.out.println("Enter String with integers: ");
//        i = input.nextLine();
//        System.out.println("Corrected String is: " + removeInteger(i));

        System.out.println("Enter String with unlimited spaces: ");
        k = input.nextLine();
        System.out.println("Corrected String is: " + stringEncryption(k));
    }

    public static String ridMultipleBlank(String s) {
        String string = new String();
        char c;
        int len = s.length();
        boolean wordAdded = false;
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (c != ' ') {
                string += c;
                wordAdded = true;
            } else if (wordAdded && i != (len - 1)) {
                string += ' ';
                wordAdded = false;
            }
        }
        return string;
    }

    public static String removeInteger(String s) {
        String string = new String();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c < '0' || c > '9') {
                string += c;
            }
        }
        return string;
    }

    public static String stringEncryption(String s) {
        
        String encrypt = null;
        for (int i = 0; i < s.length(); i++) {
            encrypt=encrypt+((char)(s.charAt(i)+ (7+i)));
        }
        return encrypt;
    }
}
