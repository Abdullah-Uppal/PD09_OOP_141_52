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
public class Task4 {

    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter your String: ");
        String str = input.nextLine();
        String c = CheckNumber(str);
        System.out.println(c);
        
        String str1 = input.nextLine();
        String c1 = CheckNumber(str1);
        System.out.println(c1);
    }

    public static String CheckNumber(String c) {
        String yes = "Contains A Number";
        String no = "Doesn't have A Number";
        String result = null;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= '0' && c.charAt(i) <= '9') {
                result = yes;
            } else {
                result = no;
            }
        }
        return result;
    }

    public static String CheckSpecial(String c) {
        String yes = "Contains Special Character";
        String no = "Doesn't have A Special Character";
        String result = null;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == '!' || c.charAt(i) == '"' || c.charAt(i) == '#' || c.charAt(i) == '$'
                    || c.charAt(i) == '%' || c.charAt(i) == '&' || c.charAt(i) == '(' || c.charAt(i) == ')'
                    || c.charAt(i) == '*' || c.charAt(i) == '+' || c.charAt(i) == ',' || c.charAt(i) == '-'
                    || c.charAt(i) == '.' || c.charAt(i) == '/' || c.charAt(i) == ':' || c.charAt(i) == ';'
                    || c.charAt(i) == '<' || c.charAt(i) == '=' || c.charAt(i) == '>' || c.charAt(i) == '?'
                    || c.charAt(i) == '@' || c.charAt(i) == '[' || c.charAt(i) == '|' || c.charAt(i) == ']'
                    || c.charAt(i) == '^' || c.charAt(i) == '_' || c.charAt(i) == '}' || c.charAt(i) == '!') {
                result = yes;
            } else {
                result = no;
            }
        }
        return result;
    }

    public static String reverseSentence(String s) {
        String string = "";
        String word = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != ' ') {
                word = word + c;
            } else {
                string = word + c + string;
                word = "";
            }
        }
        string = word + ' ' + string;
        return string;
    }

}

class MyString {

    private String string;

    MyString(String string) {
        this.string = string;
    }

    MyString() {
        this.string = new String();
    }

    public String reversed() {
        String s = new String();
        for (int i = (this.string.length() - 1); i >= 0; i--) {
            s += this.string.charAt(i);
        }
        return s;
    }

    public String sorted(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        char temp;
        for (int i = 0; i < len; i++) {
            for (int f = i; f < len; f++) {
                if (arr[i] > arr[f]) {
                    temp = arr[i];
                    arr[i] = arr[f];
                    arr[f] = temp;
                }
            }
        }
        return new String(arr);
    }

    public String center(int fieldWidth) {
        int len = this.string.length();
        int spaces = fieldWidth - len;
        if (spaces <= 0) {
            return this.string;
        }
        String s = "";
        for (int i = 0; i < spaces / 2; i++) {
            s += ' ';
        }
        s += this.string;
        for (int i = 0; i < spaces / 2; i++) {
            s += ' ';
        }
        return s;
    }

    public void insert(String toInsert, int index) {
        int len = this.string.length();
        String s = "";
        if (index >= len) {
            this.string += toInsert;
            return;
        }
        for (int i = 0; i < index; i++) {
            s += this.string.charAt(i);
        }
        s += toInsert;
        for (int i = index; i < len; i++) {
            s += this.string.charAt(i);
        }
        this.string = s;
    }

    @Override
    public String toString() {
        return this.string;
    }
}
