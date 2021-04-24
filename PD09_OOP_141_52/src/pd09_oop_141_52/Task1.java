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
        System.out.println(vowelcounter(s));
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
    public static int vowelcounter(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
                    s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
                    s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||
                    s.charAt(i)=='U')
            {
                count++;
            }
        }
        
        return count;
        
    }
}
