/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd09_oop_141_52;

/**
 *
 * @author Hp
 */
public class Task1 {

    public static void main(String []args) {
        String s = "My name  is    Muhammad Abdullah and  I live in Lahore";
        System.out.println(wordCounter(s));
    }
    public static int wordCounter(String s) {
        int count = 1;
        char previous = s.charAt(0);
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == ' ' && previous != ' ') 
                count++;
            previous = s.charAt(i);
        }
        return count;

    }
}
