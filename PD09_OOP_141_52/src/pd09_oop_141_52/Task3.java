/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd09_oop_141_52;

/**
 *
 * @author abdullah
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(ridMultipleBlank("  Hasnain       Bhatti     ."));
        System.out.println(removeInteger("He is78 a go23od Prog97ram08mer!"));
    }
    public static String ridMultipleBlank(String s) {
        String string = new String();
        char c;
        int len = s.length();
        boolean wordAdded = false;
        for (int i = 0; i<len; i++) {
            c = s.charAt(i);
            if (c != ' ') {
                string += c;
                wordAdded = true;
            }
            else if (wordAdded && i != (len-1)){
                string += ' ';
                wordAdded = false;
            }
        }
        return string;
    }
    public static String removeInteger(String s) {
        String string = new String();
        char c;
        for (int i = 0; i<s.length(); i++) {
            c = s.charAt(i);
            if (c < '0' || c > '9') {
                string += c;
            }
        }
        return string;
    }
}
