/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd09_oop_141_52;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        System.out.println("Enter the string: ");
        s = input.nextLine();
        String ver = displayVertical(s);
    }

    public static String displayVertical(String s) {
        String ver = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A'
                    && s.charAt(i) <= 'Z' || s.charAt(i) >= '0' && s.charAt(i) <= '9'
                    || s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '"'
                    || s.charAt(i) == '"' || s.charAt(i) == '\''
                    || s.charAt(i) == ',' || s.charAt(i) == '-' || s.charAt(i) == '_'
                    || s.charAt(i) == '!' || s.charAt(i) == ':'
                    || s.charAt(i) == ';' || s.charAt(i) == '(' || s.charAt(i) == ')'
                    || s.charAt(i) == '[' || s.charAt(i) == ']'
                    || s.charAt(i) == '\\') 
            {
                System.out.println(s.charAt(i));
                ver = s;
            }
        }
        return ver;
    }
}
